package com.mayyas.rentingcars;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.mayyas.rentingcars.Repos.CarsRepos;
import com.mayyas.rentingcars.entites.Cars;


@SpringBootTest
class RentingCarsApplicationTests {

	@Autowired
	private CarsRepos carsRepos;


	@Test
	void createCar() {
		
		Cars car=new Cars();
		car.setId("w11e1234");
		carsRepos.save(car);
		//System.out.println("mayyas");
		
		
	}

}
