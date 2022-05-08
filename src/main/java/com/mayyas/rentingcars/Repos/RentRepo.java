package com.mayyas.rentingcars.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayyas.rentingcars.entites.Rent;

public interface RentRepo extends JpaRepository<Rent, Integer> {

}
