package com.Ornekler_SwitchCase;
import java.util.Scanner;

public class HaftaGunleri
{

	public static void main(String[] args)
	{
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Sayı: ");
		int sayi = okuyucu.nextInt();
		
		switch(sayi)
		{
		
		case 1:
		
			System.out.println("Pazartesi.");
			break;
		
		case 2:
		
			System.out.println("Salı.");
			break;
		
		case 3:
		
			System.out.println("Çarşamba.");
			break;
		
		case 4:
		
			System.out.println("Perşembe.");
			break;
		
		case 5:
		
			System.out.println("Cuma.");
			break;
		
		case 6:
		
			System.out.println("Cumartesi.");
			break;
		
		case 7:
		
			System.out.println("Pazar.");
			break;
		
			default :
			
				System.out.println("Lütfen 1 ile 7 Arasında Bir Sayı Giriniz!");
				
			
		}
	}
}