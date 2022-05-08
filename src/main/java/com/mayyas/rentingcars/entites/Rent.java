package com.mayyas.rentingcars.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Rent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_rent;
	private String name;
	private String id_person;
	private String return_date;
	private String take_date;
	@OneToOne
	private Cars car;
	public Integer getId_rent() {
		return id_rent;
	}
	public void setId_rent(Integer id_rent) {
		this.id_rent = id_rent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId_person() {
		return id_person;
	}
	public void setId_person(String id_person) {
		this.id_person = id_person;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public String getTake_date() {
		return take_date;
	}
	public void setTake_date(String take_date) {
		this.take_date = take_date;
	}
	public Cars getCar() {
		return car;
	}
	public void setCar(Cars car) {
		this.car = car;
	}

}
