package dgv;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj napięcia");
			double napiecie1 = scan.nextDouble();
			double napiecie2 = scan.nextDouble();
			
			double wyjscie = napiecie1 + napiecie2;
			
			if(wyjscie>1) {
				wyjscie = 1;
			}
			if (wyjscie<-1) {
				wyjscie = -1;
			}
			
			System.out.println(wyjscie);
	}

}
