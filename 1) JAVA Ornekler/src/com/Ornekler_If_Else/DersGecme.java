package com.Ornekler_If_Else;
import java.util.Scanner;

public class DersGecme 
{

	public static void main(String[] args)
	{
		Scanner okuyucu = new Scanner(System.in);
		System.out.print("Adınızı Giriniz: ");
		String ad = okuyucu.next();
		
		System.out.print("Soyadınızı Giriniz: ");
		String soyad = okuyucu.next();
		
		System.out.print("Dersi Giriniz: ");
		String ders = okuyucu.next();
		
		System.out.print("Vize 1 Notunuzu Giriniz: ");
		double vize1 = okuyucu.nextDouble();
		
		System.out.print("Vize 1 Notunuzu Giriniz: ");
		double vize2 = okuyucu.nextDouble();
		
		System.out.print("Final Notunuzu Giriniz: ");
		double Final = okuyucu.nextDouble();
		
		double sonuc = (vize1 * 0.3) + (vize2 * 0.3) + (Final * 0.4);
		
		
		System.out.println(ad + " " + soyad + " isimli öğrencinin " + ders + " isimli dersinin ortalaması: " + sonuc);
		if (sonuc >= 60)
		{
			System.out.println("Tebrikler, Dersi Başarıyla Tamamladınız!");
		}
		else 
		{
			System.out.println("Maalesef Dersi Başarıyla Tamamlayamadınız!");
		}
	
	}

}
