package com.shyamal.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shyamal.models.User;

public interface repo extends  JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.destination = :destination AND DATE(u.travelDate) = DATE(:travelDate)")
    List<User> findUsersByDestinationAndTravelDate(@Param("destination") String destination, @Param("travelDate") Date travelDate);
}
	

