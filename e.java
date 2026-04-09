package dgv;


import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Podaj liczbę A");
		int A = scan.nextInt();
		
		System.out.println("Podaj liczbę B");
		int B = scan.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("TAK");
		}
		else {
			System.out.println("NIE");
		}
		

	}

}
