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
		for (Entry<Animal, Integer> entry : this.contents.entrySet()) {
			if (entry.getKey().getItemID().equals(a.getItemID())) {
				this.contents.replace(entry.getKey(), entry.getValue()+1);
				total += a.getListPrice();
				return;
			}
		}
		total += a.getListPrice();
		this.contents.put(a, 1);
	}
	
	public boolean hasAnimal(Animal a) {
		for (Entry<Animal, Integer> entry : this.contents.entrySet()) {
			if (entry.getKey().getItemID().equals(a.getItemID())) {
				return true;
			}
		}
		return false;
	}
	
	public int getAnimalAmount(Animal a) {
		for (Entry<Animal, Integer> entry : this.contents.entrySet()) {
			if (entry.getKey().getItemID().equals(a.getItemID())) {
				return entry.getValue();
			}
		}
		return -1;
	}
	
	
	public void printCart() {
		System.out.println("Carrito de compras: ");
		System.out.println("PID\tNombre\t\t\t\tPrecio\t\tCantidad\ttotal");
		System.out.println("-------------------------------------------------------------------------------");
		for (Entry<Animal, Integer> entry : this.contents.entrySet()) {
			Animal a = entry.getKey();
			int amount = entry.getValue();
			System.out.printf("%-8s%-30s\t$%2.2f\t\t%02d\t\t$%2.2f\n",
						a.getItemID(),
						a.getDescription(),
						a.getListPrice(),
						amount,
						a.getListPrice()*amount
					);
		}
		System.out.println("-------------------------------------------------------------------------------");
		System.out.printf("Total: \t$%2.2f\n", total);
	}
	
	public boolean isEquivalentTo(ShoppingCart other) {
		for (Entry<Animal, Integer> entry : this.contents.entrySet()) {
			if (!other.hasAnimal(entry.getKey())) {
				return false;
			} else {
				if(other.getAnimalAmount(entry.getKey()) != entry.getValue()) {
					return false;
				} 
			}
		}
		return true;
	}
}
