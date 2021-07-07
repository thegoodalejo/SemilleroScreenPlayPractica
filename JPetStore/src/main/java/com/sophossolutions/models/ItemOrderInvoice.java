package com.sophossolutions.models;

public class ItemOrderInvoice {
	private String strIdOrder;
	private String strDate;
	private String strTime;

	public ItemOrderInvoice(String strIdorder, String strdate, String strtime) {
		this.strIdOrder = strIdorder;
		this.strDate = strdate;
		this.strTime = strtime;
	}

	public String getStrIdOrder() {
		return strIdOrder;
	}

	

	public String getStrDate() {
		return strDate;
	}

	

	public String getStrTime() {
		return strTime;
	}

	

	
}