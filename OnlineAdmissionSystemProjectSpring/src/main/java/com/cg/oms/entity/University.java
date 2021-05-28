package com.cg.oms.entity;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class University{
		
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int universityId;
	
	@Embedded
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="UniversityAddress_Id",referencedColumnName="addressId")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="universityId")
	private List<College> collgeList;
	
	public University() {
	
	}
	
	public University(String name, Address address,List<College> collgeList) {
		super();
		this.name = name;
		this.address = address;
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

	public List<College> getCollgeList() {
		return collgeList;
	}

	public void setCollgeList(List<College> collgeList) {
		this.collgeList = collgeList;
	}
	
	


}
