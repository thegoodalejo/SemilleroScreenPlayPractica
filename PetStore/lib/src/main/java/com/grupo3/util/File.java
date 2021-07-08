package com.grupo3.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ThreadLocalRandom;

public class File {
	
	public static String randomTitleForPost() {
		int l = ThreadLocalRandom.current().nextInt(0, 9999);
		
		try {
			return Files.readAllLines(Paths.get("src/test/resources/com/grupo3/datadriven/titles.txt")).get(l);
		} catch (IOException e) {
			return "Lorem Ipsum Dolor Sit Amet";
		}
	}
	
	public static String randomBodyForPost() {
		int l = ThreadLocalRandom.current().nextInt(0, 9999);
		
		try {
			return Files.readAllLines(Paths.get("src/test/resources/com/grupo3/datadriven/bodies.txt")).get(l);
		} catch (IOException e) {
			return "Lorem Ipsum Dolor Sit Amet";
		}
	}
	
}
