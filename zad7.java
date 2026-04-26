package dgv;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj: stan przycisku, predkosc oraz przyspieszenie");
		boolean przycisk = scan.nextBoolean();
		int v = scan.nextInt(); // prędkość
		int a = scan.nextInt(); // przyspieszenie
		double t; // czas
		double s; // droga
		double vk; // predkosc koncowa 
		
		if (przycisk) {
			if(v==0) {
				t = 5;
				s = (a*t*t)/2;
				System.out.println(s);
			}
			else {
				vk = 0;
				t = (vk-v)/-a;
				System.out.println(t);
			}
	
		}
		else {
			System.out.println("0");
		}

	}

}
