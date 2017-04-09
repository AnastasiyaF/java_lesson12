/*
 *  Created by Anastasiya Findziukevich
 *  02/04/2017
 *  
 *  Task 12.
 *  
 *  �������� ����������� �������, ������������ ����������� ���������� ����������, ��������� � ��������� �������.
 */

package com.epam.java_training.main;

import com.epam.java_training.plants.BouquetFlowers;

public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("��� ��������� �����: ");
		
		BouquetFlowers.printNameFlowers();
		
		
		System.out.println("����������� ����� 1 ������: ");
		
		BouquetFlowers bouquetFlowers1 = new BouquetFlowers();
		
		bouquetFlowers1.addFlower(1, 30, 5);
		
		bouquetFlowers1.addFlower(4, 6, 8);
		
		bouquetFlowers1.addFlower(3, 40, 8);
		
		
		
		System.out.println("����������� ����� 2 ������: ");
		
		BouquetFlowers bouquetFlowers2 = new BouquetFlowers();
		
		bouquetFlowers2.addFlower(2, 4, 20);
		
		bouquetFlowers2.addFlower(5, 2, 8);

		
		
		System.out.println("��� ��������� ����� � 1 ������: ");
		
		bouquetFlowers1.printFlowers();
		
		System.out.println("������� ���� 1 ������: " + bouquetFlowers1.getPrice_bouquet());
		
		System.out.println("���� 1 ������ � ������ ������: " + bouquetFlowers1.getFinalPrice_bouquet());
		
		
		
		
		System.out.println("��� ��������� ����� � 2 ������: ");
		
		bouquetFlowers2.printFlowers();
		
		System.out.println("������� ���� 2 ������: " + bouquetFlowers2.getPrice_bouquet());
		
		System.out.println("���� 2 ������ � ������ ������: " + bouquetFlowers2.getFinalPrice_bouquet());
		
		
		
		System.out.println("��� ���������� ������� ������ ");
		
		BouquetFlowers.Provider.setBonus();
		
		System.out.println("���� 1 ������ � ������ ������: " + bouquetFlowers1.getFinalPrice_bouquet());
		
		System.out.println("���� 2 ������ � ������ ������: " + bouquetFlowers2.getFinalPrice_bouquet());
		
		
		System.out.println("������� �������� �� 2 ������: ");
		bouquetFlowers2.packageBouquet();
	
		
		System.out.println("����������� ����� 3 ������ c ������ �������������� ��������� ������ ������ = 100 ������ � ��� ������� ������");
		
		// ��������� �����, ������� ������ � ��������� ��������� ������ ������
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
		
        System.out.println("��� ��������� ����� � 3 ������: ");
		
		bouquetFlowers3.printFlowers();
		
		System.out.println("������� ���� 3 ������: " + bouquetFlowers3.getFinalPrice_bouquet());
	}

}
