package com.grupo3.model;

public class Usuario
{
	private String strUserId;
	private String strPassword;
	private String strFirstName;
	private String strLastName;
	private String strEmail;
	private String strPhone;
	private String strAdsress1;
	private String strAddress2;
	private String strCity;
	private String strState;
	private String strZip;
	private String strCountry;
	
	public Usuario(String strUserId, String strPassword, String strFirstName, String strLastName, String strEmail, String strPhone, String strAdsress1,
			String strAddress2, String strCity, String strState, String strZip, String strCountry)
	{
		this.strUserId = strUserId;
		this.strPassword = strPassword;
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strEmail = strEmail;
		this.strPhone = strPhone;
		this.strAdsress1 = strAdsress1;
		this.strAddress2 = strAddress2;
		this.strCity = strCity;
		this.strState = strState;
		this.strZip = strZip;
		this.strCountry = strCountry;
	}

	
	public String getStrUserId()
	{
		return strUserId;
	}

	public String getStrPassword()
	{
		return strPassword;
	}
	
	public String getStrFirstName()
	{
		return strFirstName;
	}

	public String getStrLastName()
	{
		return strLastName;
	}

	public String getStrEmail()
	{
		return strEmail;
	}

	public String getStrPhone()
	{
		return strPhone;
	}

	public String getStrAdsress1()
	{
		return strAdsress1;
	}

	public String getStrAddress2()
	{
		return strAddress2;
	}

	public String getStrCity()
	{
		return strCity;
	}

	public String getStrState()
	{
		return strState;
	}

	public String getStrZip()
	{
		return strZip;
	}

	public String getStrCountry()
	{
		return strCountry;
	}
}