package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("1/2 integer to be averaged?");
		int n1 = in.nextInt();
		System.out.print("2/2 integer to be averaged?");
		int n2 = in.nextInt();
		double average = ((double)(n1 + n2)/2);
		System.out.print(average);
	}

}
