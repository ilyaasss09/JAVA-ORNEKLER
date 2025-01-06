package com.Ornekler_If_Else;

public class Kuruyemiş 
{

	public static void main(String[] args)
	{
		double leblebi = 3.5;
		double findik = 15.7;
		double badem = 22;
		
		double maliyet = (12 * leblebi) + (25 * findik) + (40 * badem);
		
		double satis = (leblebi * 1.5) * 12 + (findik * 1.4) * 25 + (badem * 1.6) * 40;
		
		double kar = satis - maliyet;
		
		System.out.println("Maliyet: " + maliyet);
		System.out.println("Satış: " + satis);
		System.out.println("Kâr: " + kar); 
		
		if (kar >= 500)
		{
			System.out.println("Kirayı ödeyebilirsin.");
		}
		else
		{
			System.out.println("Kirayı ödeyemezsin.");
		}
	}

}
