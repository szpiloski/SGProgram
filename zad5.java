package dgv;


import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj rok:");
		int rok = scan.nextInt();
		
		if(rok%4 == 0) {
			if(rok%100 == 0 && rok%400 != 0) {
				System.out.println("NIE");
			}
			else System.out.println("TAK");
		}
		else System.out.println("NIE");
		
		
	}

}
