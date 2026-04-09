package dgv;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj liczbę A");
		int A = scan.nextInt();
		
		System.out.println("Podaj liczbę B");
		int B = scan.nextInt();
		
		double answer = A/(B*B);
		 		
		System.out.println(answer);
		
	}

}
