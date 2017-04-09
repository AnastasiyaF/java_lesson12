/*
 *  Created by Anastasiya Findziukevich
 *  02/04/2017
 *  
 *  Task 12.
 *  
 *  Напишите собственные примеры, показывающие особенности применения внутренних, вложенных и анонимных классов.
 */

package com.epam.java_training.main;

import com.epam.java_training.plants.BouquetFlowers;

public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Все доступные цветы: ");
		
		BouquetFlowers.printNameFlowers();
		
		
		System.out.println("Комплектуем набор 1 цветов: ");
		
		BouquetFlowers bouquetFlowers1 = new BouquetFlowers();
		
		bouquetFlowers1.addFlower(1, 30, 5);
		
		bouquetFlowers1.addFlower(4, 6, 8);
		
		bouquetFlowers1.addFlower(3, 40, 8);
		
		
		
		System.out.println("Комплектуем набор 2 цветов: ");
		
		BouquetFlowers bouquetFlowers2 = new BouquetFlowers();
		
		bouquetFlowers2.addFlower(2, 4, 20);
		
		bouquetFlowers2.addFlower(5, 2, 8);

		
		
		System.out.println("Все доступные цветы в 1 наборе: ");
		
		bouquetFlowers1.printFlowers();
		
		System.out.println("Текущая цена 1 набора: " + bouquetFlowers1.getPrice_bouquet());
		
		System.out.println("Цена 1 набора с учетом скидки: " + bouquetFlowers1.getFinalPrice_bouquet());
		
		
		
		
		System.out.println("Все доступные цветы в 2 наборе: ");
		
		bouquetFlowers2.printFlowers();
		
		System.out.println("Текущая цена 2 набора: " + bouquetFlowers2.getPrice_bouquet());
		
		System.out.println("Цена 2 набора с учетом скидки: " + bouquetFlowers2.getFinalPrice_bouquet());
		
		
		
		System.out.println("Для поставщика добавим скидку ");
		
		BouquetFlowers.Provider.setBonus();
		
		System.out.println("Цена 1 набора с учетом скидки: " + bouquetFlowers1.getFinalPrice_bouquet());
		
		System.out.println("Цена 2 набора с учетом скидки: " + bouquetFlowers2.getFinalPrice_bouquet());
		
		
		System.out.println("Добавим упаковку ко 2 набору: ");
		bouquetFlowers2.packageBouquet();
	
		
		System.out.println("Комплектуем набор 3 цветов c учетом дополнительной стоимости ручной работы = 100 рублей и нет бонусов совсем");
		
		// анонимный класс, убираем бонусы и добавляем стоимость ручной работы
		BouquetFlowers bouquetFlowers3 = new BouquetFlowers(){
			Integer extra_price = 100;
			
			public Integer getFinalPrice_bouquet(){
				setExtraPrice();
				return this.getPrice_bouquet();
				
			}
			
			public void setExtraPrice() {
				
				this.setPrice_bouquet(extra_price);
			}	
			
		};
		
		bouquetFlowers3.addFlower(1, 3, 2);
		
		bouquetFlowers3.addFlower(5, 1, 7);
		
        System.out.println("Все доступные цветы в 3 наборе: ");
		
		bouquetFlowers3.printFlowers();
		
		System.out.println("Текущая цена 3 набора: " + bouquetFlowers3.getFinalPrice_bouquet());
	}

}
