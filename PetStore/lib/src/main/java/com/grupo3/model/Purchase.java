package com.grupo3.model;

public class Purchase {
	
	private Address billingAddr;
	private Address shippingAddr;
	private ShoppingCart cart;
	private String cardNumber;
	private String cardType;
	private String expiryDate;
	
	public Purchase(Address addr, String cardNumber, String cardType, String expiryDate) {
		this.billingAddr = addr;
		this.shippingAddr = addr;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.expiryDate = expiryDate;
	}
	
	public void addToCart(Animal a) {
		this.cart.addToCart(a);
	}
	
	public void setShoppingCart(ShoppingCart s) {
		this.cart = s;
	}
	
	public boolean shippingAddressEquals(Address a) {
		return this.shippingAddr.equals(a);
	}
	public boolean billingAddressEquals(Address a) {
		return this.billingAddr.equals(a);
	}
	
	public void printPurchaseShoppingCart() {
		this.cart.printCart();
	}
	
	public boolean shoppingCartIsEqualTo(ShoppingCart s) {
		return this.cart.isEquivalentTo(s);
	}
}
