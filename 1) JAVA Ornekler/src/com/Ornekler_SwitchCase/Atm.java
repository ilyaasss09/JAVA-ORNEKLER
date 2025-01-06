package com.Ornekler_SwitchCase;
import java.util.Scanner;

public class Atm 
{

	public static void main(String[] args)
	{
		// İlyas Bakkal : IBAN  TR1234 421 412 973  8201 65 95
		// Alperen Göktaş : IBAN  TR9824 763 123 862 6821 63 17
		
		String ilyasAd = "ilyas9132";
		String ilyasSifre = "198asld";
		String ilyasIban = "TR123442141297382016595";
		double ilyasBakiye = 98245.91;
		
		String alperenAd = "alper024";
		String alperenSifre = "qlskjd4";
		String alperenIban = "TR982476312386268216317";
		double alperenBakiye = 78341.22;
		
		String islemler = "BAKİYE GÖRÜNTÜLEME İÇİN 1 E BASINIZ."
				+ "\nPARA ÇEKMEK İÇİN 2 YE BASINIZ."
				+ "\nFARKLI HESABA PARA YATIRMAK İÇİN 3 E BASINIZ."
				+ "\nÇIKIŞ İÇİN q YA BASINIZ.";
		
		System.out.println("ATM ' ye HOŞGELDİNİZ.");
		System.out.println("BİLGİLERİNİZİ GİRİNİZ!");
		System.out.println();
		
		System.out.print("KULLANICI ADI: ");
		Scanner okuyucu = new Scanner(System.in);
		String kullaniciAdi = okuyucu.nextLine();
		
		System.out.print("ŞİFRE: "); 
		String sifre = okuyucu.nextLine();
	
		
		if(kullaniciAdi.equals("ilyas9132") && sifre.equals("198asld"))
		{
			System.out.println("\nİlyas Bakkal Hesabına Giriş Yapıldı");
			System.out.println();
			System.out.println(islemler);
			System.out.print("\nYapmak İstediğiniz İşlemi Seçiniz: ");
			String secim = okuyucu.nextLine();
			
			switch(secim)
			{
			case "1" : 
				System.out.println("\nBAKİYENİZ: " + ilyasBakiye);
				break;
				
			case "2" : 
				System.out.print("\nÇekmek İstediğiniz Tutarı Giriniz: ");
				int cekilecekTutar = okuyucu.nextInt();
				if(ilyasBakiye >= cekilecekTutar)
				{
					System.out.println("\nParanız Çekiliyor...");
					ilyasBakiye -= cekilecekTutar;
					System.out.println("\nKalan Bakiye: " + ilyasBakiye);
				}
				else
				{
					System.out.println("\nYetersiz Bakiye!");
				}
				break;
				 
			case "3" :
				System.out.print("\nYatırmak İstediğiniz Tutarı Giriniz: ");
				int yatirilacakTutar = okuyucu.nextInt();
				if(yatirilacakTutar <= ilyasBakiye)
				{
					System.out.print("\nIBAN Giriniz: ");
					okuyucu.nextLine();
					String yatirilacakIban = okuyucu.nextLine();
					if(yatirilacakIban.equals(alperenIban))
					{
						System.out.println("\nPara Alperen Göktaş İsimli Hesaba Aktarılıyor...");
						ilyasBakiye -= yatirilacakTutar;
						alperenBakiye += yatirilacakTutar;
						System.out.println("\nKalan Bakiye: " + ilyasBakiye);
					}
				}
				
				break;
				
			case "q" :
				System.out.println("\nÇIKIŞ YAPILIYOR...");
				break;
				
			} 
		}
		
		
		else if(kullaniciAdi.equals("alper024") && sifre.equals("qlskjd4"))
		{
			System.out.println("\nAlperen Göktaş Hesabına Giriş Yapıldı");
			System.out.println(islemler);
			System.out.print("\nYapmak İstediğiniz İşlemi Seçiniz.");
			String secim = okuyucu.nextLine();
			
			switch(secim)
			{
			case "1" : 
				System.out.println("\nBAKİYENİZ: " + alperenBakiye);
				break;
				
			case "2" : 
				System.out.print("\nÇekmek İstediğiniz Tutarı Giriniz: ");
				int cekilecekTutar = okuyucu.nextInt();
				if(alperenBakiye >= cekilecekTutar)
				{
					System.out.println("\nParanız Çekiliyor...");
					alperenBakiye -= cekilecekTutar;
					System.out.println("Kalan Bakiye: " + alperenBakiye);
				}
				else
				{
					System.out.println("\nYetersiz Bakiye!");
				}
				break;
			case "3" :
				System.out.print("\nYatırmak İstediğiniz Tutarı Giriniz: ");
				int yatirilacakTutar = okuyucu.nextInt();
				if(yatirilacakTutar <= alperenBakiye)
				{
					System.out.print("\nIBAN Giriniz: ");
					okuyucu.nextLine();
					String yatirilacakIban = okuyucu.next();
					if(yatirilacakIban.equals(ilyasIban))
					{
						System.out.println("\nPara İlyas Bakkal İsimli Hesaba Aktarılıyor...");
						alperenBakiye -= yatirilacakTutar;
						ilyasBakiye += yatirilacakTutar;
						System.out.println("\nKalan Bakiye: " + alperenBakiye);
					}
				}
				
				break;
				
			case "q" :
				System.out.println("\nÇIKIŞ YAPILIYOR...");
				break;
				
				}
			}
		
		
		else
		{
			System.out.println("\nHATALI GİRİŞ!");
		}
		
		
		
		
		
		
		
		
	}
	
}


