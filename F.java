package dgv;

import java.util.Scanner;

public class F {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		int a;
		int ile;
		System.out.println("Ile liczb podasz?");
		
		do {
		ile = scan.nextInt();
		if (ile <=0 ){
			System.out.println("Podaj liczbę dodatnią");
		}
		} while(ile <= 0);
		int[] liczby = new int[ile];
		
		String forma;
		if(ile == 1) {
			forma = "liczbę";
		}
		
		else if ((ile%10 > 0 && ile <= 4)&& !(ile > 10 && ile <15)) {
			forma = "liczby";
		}
		else {
			forma = "liczb";
		}
		
		
		
		
		System.out.println("Podaj "+ ile + " " + forma);
		for(int i = 0; i<ile; i++) {
		liczby[i] = scan.nextInt();
		}
		 
		for(int i=0;i<ile;i++) {
			 if(liczby[i] > 7){
				 System.out.println("TAK");
			 }
			 else {
				 System.out.println("NIE");
			 }
		 }
		
		
	}

}
