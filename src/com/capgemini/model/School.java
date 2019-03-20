package com.capgemini.model;

import java.util.Objects;

public class School {
	
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;
	public School() {
		super();
		}
	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchoolDistrict() {
		return schoolDistrict;
	}
	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}
	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public int hashCode() {
	
		return Objects.hash(name,city,schoolDistrict);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(!(obj instanceof School))
			return false;
		School school = (School) obj;
		if(this.name == school.name && this.city == school.city && this.schoolDistrict == school.schoolDistrict)
		return true;
		else
			return false;
	}	
	
}
