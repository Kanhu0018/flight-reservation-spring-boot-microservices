package com.FlightCheckIn.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.FlightCheckIn.Integration.ReservationRestfulClient;
import com.FlightCheckIn.Integration.dto.Reservation;
import com.FlightCheckIn.Integration.dto.ReservationUpdateRequest;
@Controller
public class ReservationController {

    @Autowired
    private ReservationRestfulClient restfulClient;
    
    @RequestMapping("/startCheckIn")
    public String showCheckIn() {
        return "startCheckIn";
    }


    @RequestMapping("/proceedCheckIn")
    public String proceedCheckin(@RequestParam("id") Long id, Model model) {
        Reservation reservation = restfulClient.findReservation(id);
        System.out.println("Test-1");
        model.addAttribute("reservation", reservation);
        System.out.println("Test-2");
        return "displayReservation";
    }
    
    @RequestMapping("/proceedToCheckIn")
    public String proceedCheckin(@RequestParam("id") Long id,@RequestParam("numberOfBags") int numberOfBags) {
    	ReservationUpdateRequest request=new ReservationUpdateRequest();
    	request.setId(id);
    	request.setNumberOfbags(numberOfBags);
    	request.setCheckedIn(true);
    	
    	restfulClient.UpdateReservation(request);
    	
    	return "confirmReservation";
    }
    
   
}
