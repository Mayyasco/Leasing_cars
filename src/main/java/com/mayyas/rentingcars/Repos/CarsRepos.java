package com.mayyas.rentingcars.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mayyas.rentingcars.entites.Cars;

public  interface  CarsRepos extends JpaRepository<Cars, String> {

//@Query("select c from Cars c where c.type=?1 and c.gear=?2")
  @Query("from Cars where type=:t and gear=:g and model_year>=:m and status=false")
	 List<Cars> search(@Param("t")String type,@Param("g")String gear,@Param("m")Integer model_year);
}
