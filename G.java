package dgv;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double A;
		double B;
		
		System.out.println("Podaj liczbę A");
		A = scan.nextInt();
		System.out.println("Podaj liczbę B");
		do {
		B = scan.nextInt();
		if(B==0) {
			System.out.println("Podaj liczbę inną od zera");
		}
		}
		while (B == 0);
		
		double answer = A/(B*B);
		 		
		System.out.println(answer);
		
	}

}
