package work;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int check;
		System.out.println("Number 1-100");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number = ");
		int number = sc.nextInt();
		int x,y;
		
		for (x = 2; x <= number; x++) {
			
			check = 1;
			
			for (y = 2; y < x; y++) {
				
				if (x % y == 0)
					
					check = 0;
			
			}

			if (check == 1)
				
				System.out.print(x + " " );
				System.out.print("Total Prime number");
		}
	}
}




