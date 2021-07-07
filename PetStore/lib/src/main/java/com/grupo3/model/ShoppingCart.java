package com.grupo3.model;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ShoppingCart {
	
	private LinkedHashMap<Animal, Integer> contents;
	private double total;
	
	public ShoppingCart() {
		this.contents = new LinkedHashMap<>();
		this.total = 0;
	}
	
	public void addToCart(Animal a) {
		if (this.contents.containsKey(a)) {
			int v = this.contents.get(a);
			this.contents.replace(a, v+1);
		} else {
			this.contents.put(a, 1);
		}
	}
	
	
	public void printCart() {
		System.out.println("Carrito de compras: ");
		for (Entry<Animal, Integer> entry : this.contents.entrySet()) {
			Animal a = entry.getKey();
			int amount = entry.getValue();
			
			System.out.println("\t" + a.getItemID() + "\t" + (a.getListPrice()*amount) + " ("+ amount + "x" + a.getListPrice() +")");
		}
		System.out.println("------------------------------------------------");
		System.out.println("Total: \t" + total);
	}
}
