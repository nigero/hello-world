package edu.ap.spring;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten

	public int[] getPrimes(int[] numbers) {
		int[] p = null;
		

		Arrays.stream(numbers)
		.filter(n->0==n%1 && 0==n%n )
		.forEach(n-> p = n);
		
		return p;
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
       
       
       int l = countLowercaseCharacters(string);
       
       
       return l;
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
		int l=0;
		
		return l;
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		String l=" ";
		
		
		return l;
		
		
	}
}
