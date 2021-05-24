package com.cg.oms.entity;

import java.util.ArrayList;

public class University 
{
	private String name;
	private int universityId;
	private Address address;
	private ArrayList<College> collgeList;
	
	public University()
	{
		
	}
	
	public University(Address address, String name, int universityId, ArrayList<College> collgeList) {
		super();
		this.address = address;
		this.name = name;
		this.universityId = universityId;
		this.collgeList = collgeList;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getUniversityId() {
		return universityId;
	}
	
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public ArrayList<College> getCollgeList() {
		return collgeList;
	}
	
	public void setCollgeList(ArrayList<College> collgeList) {
		this.collgeList = collgeList;
	}
	
}
