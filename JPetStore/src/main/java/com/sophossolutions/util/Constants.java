package com.sophossolutions.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Constants
{
	public static final String ACTOR_NAME = "Juan Miguel y Santaigo";
	public static final String REMEMBER = "NUMBER_ACOUNT";
	public static final String MODEL_CARRITO = "ModeloCarrito";
	public static final String TOKEN_GOREST = "837d26a1749dbe0896d8d274624a165ddee934c497733fd9430d9af57e9f2f10";
	public static final String MODEL_ORDER = "ModelOrder";
	public static final String DIR_INDEX_ANIMAL = "indexAnimal";
	public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	public static final String DATE_TODAY = dtf.format(LocalDateTime.now());
	public static final String MODEL_ANIMAL = "ModelAnimal";
	public static final String MODEL_CART = "ModelCart";
	public static final String INDEX_STATUS_CODE = "indexStatusCode";
}