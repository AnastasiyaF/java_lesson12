package com.epam.java_training.plants;

public class Flower {
	
	private String name;
	private Integer count;
	private Integer price;
	
    
	protected Flower(NameFlower name){
    	
        this.name = name.toString();
    }

    protected Flower(NameFlower name, Integer price, Integer count){
    	
        this.name = name.toString();
        
        if (price < 0) {
            throw new IllegalArgumentException("Price can not be less then zero.");
        }
        this.price = price;
        
        if (count < 0) {
            throw new IllegalArgumentException("Count can not be less then zero.");
        }
        this.count = count;

    }

    public String getName() {
        return this.name;
    }
    
    public Integer getCount() {
        return this.count;
    }
    
    public void setCount(Integer count) {
        this.count = count;
    }
    
    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.count = price;
    }
    
    public String getInfo(){
    	
    	return "Name: "+name.toString()+" , price: "+Integer.toString(price)+" , current count: "+Integer.toString(count);
    } 

}
