package com.sophossolutions.models;

public class RegisterModel
{
	private String strFirsName;
	private String strLastName;
	private String strAddress;
	private String strPhone;
	private boolean isMarried;
	
	public RegisterModel(String strFirsName, String strLastName, String strAddress, String strPhone, boolean isMarried)
	{
		super();
		this.strFirsName = strFirsName;
		this.strLastName = strLastName;
		this.strAddress = strAddress;
		this.strPhone = strPhone;
		this.isMarried = isMarried;
	}
	
	public String getStrFirsName()
	{
		return strFirsName;
	}
	
	public String getStrLastName()
	{
		return strLastName;
	}
	
	public String getStrAddress()
	{
		return strAddress;
	}
	
	public String getStrPhone() {
		return strPhone;
	}
	
	public boolean isMarried()
	{
		return isMarried;
	}
}