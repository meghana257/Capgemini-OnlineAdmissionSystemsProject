package com.cg.oms.service;

import java.util.ArrayList;

import com.cg.oms.entity.Address;

public interface IAddressService
{
	public Address addAddress(Address address);
	public int deleteAddressById(int addressId);
//	public int deleteAddressByCity(String city);
	public boolean updateAddress(Address newAddress);
	public Address getAddressById(int addressId);
	

}
