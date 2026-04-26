package dgv;


import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		
		int suma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ile liczb podasz?");
		int N = scan.nextInt();
		
		int liczby[] = new int[N];
		
		System.out.println("Podaj liczb: " + N);
		for(int i = 0; i<N; i++ ) {
			liczby[i] = scan.nextInt();
					}

		for(int i=0; i<N; i++) {
			suma += liczby[i];
		}
		
		System.out.println(suma);
	}

}
