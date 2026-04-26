package dgv;

import java.util.Scanner;

public class zad8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean zawieraNute = false;
		
		System.out.println("Podaj słowo");
		String slowo = scan.next();

		String[] nuty = {"do", "re","mi","fa","sol","la","si","do"};
		
		for(String nuta : nuty ) {
			if(slowo.contains(nuta)) {
				zawieraNute = true;
				break;
			}
		}
		
		if (zawieraNute==false) {
			System.out.println("NIE");
		}
		else {
			System.out.println("TAK");
		}
		
	}

}
