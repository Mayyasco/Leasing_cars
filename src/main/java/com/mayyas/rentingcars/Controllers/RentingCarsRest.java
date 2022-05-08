package com.mayyas.rentingcars.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.mayyas.rentingcars.entites.Cars;
import com.mayyas.rentingcars.entites.Rent;
import com.mayyas.rentingcars.odt.SearchItems;
import com.mayyas.rentingcars.odt.UncheckedReq;
import com.mayyas.rentingcars.Repos.CarsRepos;
import com.mayyas.rentingcars.Repos.RentRepo;

@RestController
@RequestMapping("/rentingcars")
public class RentingCarsRest {
	@Autowired
	private CarsRepos carsRepos;
	@Autowired
	private RentRepo rentRepo;
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public List<Cars> searchCar(@RequestBody SearchItems si) {

		return carsRepos.search(si.getType(),si.getGear(),si.getModel_year());

	}
	
	@RequestMapping(value="/addcar",method=RequestMethod.POST)
	public Cars addCar(@RequestBody Cars car) {
		return carsRepos.save(car);

	}
	
	@RequestMapping(value="/getcar/{id}",method=RequestMethod.GET)
	public Cars getCar(@PathVariable("id") String id ) {

		return carsRepos.findById(id).get();

	}
	@RequestMapping(value="/deletecar/{id}",method=RequestMethod.GET)
	public void deleteCar(@PathVariable("id") String id ) {

		 carsRepos.deleteById(id);

	}
	@RequestMapping(value="/updatecar",method=RequestMethod.POST)
	public Cars updateCar(@RequestBody Cars car) {
		return carsRepos.save(car);

	}
	@RequestMapping(value="/addrent",method=RequestMethod.POST)
	public Rent addRent(@RequestBody Rent rent) {
		Cars car =rent.getCar();
		System.out.println(car.getId());
		return rentRepo.save(rent);

	}
	@RequestMapping(value="/unchecked",method=RequestMethod.POST)
	//public Cars unchecked(@RequestParam("status") boolean status,@RequestParam("id") String id ) {
	public void unchecked(@RequestBody UncheckedReq u ) {
		Cars car=carsRepos.findById(u.getCar_id()).get();
		car.setStatus(false);
		carsRepos.save(car);
		
		Rent rent=rentRepo.findById(u.getRent_id()).get();
		rent.setReturn_date(u.getReturn_date());
		rentRepo.save(rent);

	}
}
