package com.grupo3.model;

public class Address {
	
	private String fName;
	private String lName;
	private String addr1;
	private String addr2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	
	public Address(String fName, String lName, String addr1, String addr2, String city, String state, String zipCode,
			String country) {
		this.fName = fName;
		this.lName = lName;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Address) {
			Address remote = (Address)obj;
			return remote.fName.equals(fName) 
					&& remote.lName.equals(lName)
					&& remote.addr1.equals(addr1)
					&& remote.addr2.equals(addr2)
					&& remote.city.equals(city)
					&& remote.state.equals(state)
					&& remote.zipCode.equals(zipCode)
					&& remote.country.equals(country);
		}
		return false;
	}
	
	
	
	

}
