package basic.training.com;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		System.out.println("Check ODD or Even");
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		if(i%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("It is Odd");
		}

	}

}
