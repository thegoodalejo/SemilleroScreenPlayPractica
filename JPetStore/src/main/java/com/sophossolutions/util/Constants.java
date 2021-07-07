package com.sophossolutions.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Constants
{
	public static final String ACTOR_NAME = "Juan Miguel y Santaigo";
	public static final String REMEMBER = "NUMBER_ACOUNT";
	public static final String MODEL_CARRITO = "ModeloCarrito";
	public static final String MODEL_ORDER = "ModelOrder";
	public static final String DIR_INDEX_ANIMAL = "indexAnimal";
	public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	public static final String DATE_TODAY = dtf.format(LocalDateTime.now());
	public static final String MODEL_ANIMAL = "ModelAnimal";
	public static final String MODEL_CART = "ModelCart";
}