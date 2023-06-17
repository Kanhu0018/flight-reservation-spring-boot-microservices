package com.Flight_Reservation_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Reservation_App.entity.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Long> {

}
