package com.epam.java_training.plants;

import java.util.ArrayList;
import java.util.List;


public class BouquetFlowers {
	private List<Flower> listFlower;
	private Integer price_bouquet;
	
	public BouquetFlowers(){
		listFlower = new ArrayList<Flower>();
		this.price_bouquet = 0;
	}
	
	public BouquetFlowers(List<Flower> listFlower){
		this.listFlower = listFlower;
	}
	
	public List<Flower>  getListFlower(){
		return this.listFlower;
	}
	
	public Integer getPrice_bouquet(){
		
		return this.price_bouquet;
	}
	
	public Integer getFinalPrice_bouquet(){
		
		Integer price_bouquet = this.getPrice_bouquet();
		
		if (Provider.bonus_status.equals("Yes")){
			
			price_bouquet = this.price_bouquet * (100 - Provider.bonus)/100;
			
		}
		
		return price_bouquet;
	}

	public void setPrice_bouquet(Integer price_bouquet){
		
		this.price_bouquet = this.price_bouquet + price_bouquet;
	}

	public void addFlower(Integer id_name, Integer price, Integer count) {
		
		boolean is_found = false;
		NameFlower name_flower = NameFlower.getName(id_name);
		
		
		for(Flower flower : this.listFlower) {
			
			if(name_flower.toString().equals(flower.getName())) {
				 
				flower.setCount(flower.getCount() + count);
				is_found = true;
				setPrice_bouquet(flower.getCount() * flower.getPrice());
			}
			
		}
		if(is_found == false) {
			
			Flower flower_new = new Flower(name_flower, price, count);
			listFlower.add(flower_new);
			setPrice_bouquet(flower_new.getCount() * flower_new.getPrice());
		}
    		
    }
	
	public void printFlowers(){
		System.out.println("Provider is " + Provider.provider_name + ", bonus id " + Provider.bonus_status);
		
		for (Flower resultFlower: listFlower){
			System.out.println(resultFlower.getInfo());
		}
	}

	public static void printNameFlowers(){
		NameFlower.printNameFlowers();
	}
	
	
	public void packageBouquet(){
		Packaging packaging = this.new Packaging("Green", "Big size");
		packaging.setPackage();
	}
	
//вложенный класс провайдер по которому регулируем бонусы
   public static class Provider{
		static String provider_name = "Provider_1";
		static String bonus_status = "No";
		
		static Integer bonus = 10;
		
		public static void setBonus(){
			
			if (Provider.bonus_status.equals("No")){
				Provider.bonus_status = "Yes";
			}
		}
		
	}
	
 //вложенный класс упаковка по которому добавляем упаковку в набор
   class Packaging{
		
	    String color;
	    String size_package;
	    
	    Packaging( String color, String size_package){
	    	
	    	this.color = color;
	    	this.size_package = size_package;
	    	
	    }
	        
		public  void setPackage(){
			
			System.out.println("The package is applied: color " + this.color + ", size_package: " + size_package);
			for (Flower resultFlower: listFlower){
				System.out.println(resultFlower.getInfo());
			}
			
		}
		
		
	}
}


