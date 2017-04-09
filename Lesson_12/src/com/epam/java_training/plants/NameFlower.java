package com.epam.java_training.plants;

import java.lang.ArrayIndexOutOfBoundsException;

public enum NameFlower{
	BEGONIA, CORNFLOWERS, GERBERA, PIPAL, ROSES, CHAMOMILE;
	
	public static void printNameFlowers() {
		Integer i = 0;
		for(NameFlower nameFlower : NameFlower.values()) {
			i++;
	    
			System.out.println(Integer.toString(i)+" - "+nameFlower);
		}
	}
	
	public static NameFlower getName(Integer position) {
		try{
			NameFlower[] nameFlower = NameFlower.values();
	
			return nameFlower[position];
		}
		catch(ArrayIndexOutOfBoundsException e){
			throw new  ArrayIndexOutOfBoundsException("There isn't such position in NameFlower");
		}
	}
	
}
