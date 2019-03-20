 package com.capgemini.model;

import java.util.Objects;

public class Television {

	private String company;
	private String type;
	private boolean enable3D;
	private double price;
	public Television() {
		super();
	
	}
	public Television(String company, String type, boolean enable3d, double price) {
		super();
		this.company = company;
		this.type = type;
		enable3D = enable3d;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEnable3D() {
		return enable3D;
	}
	public void setEnable3D(boolean enable3d) {
		enable3D = enable3d;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	@Override
	public int hashCode() {
	
		return Objects.hash(company,type,price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(!(obj instanceof Television))
			return false;
		Television television = (Television) obj;
		if(this.company == television.company && this.type == television.type && this.price == television.price)
		return true;
		else
			return false;
	}	
	
	
}
