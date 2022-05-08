package com.mayyas.rentingcars.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Cars {
	@Id
	private String id;
	private String type;
	private int model_year;
	private int cost_per_day;
	private boolean status;
	private String gear;
	@Lob
	private byte[] image;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getModel_year() {
		return model_year;
	}
	public void setModel_year(int model_year) {
		this.model_year = model_year;
	}
	public int getCost_per_day() {
		return cost_per_day;
	}
	public void setCost_per_day(int cost_per_day) {
		this.cost_per_day = cost_per_day;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getGear() {
		return gear;
	}
	public void setGear(String gear) {
		this.gear = gear;
	}


}
