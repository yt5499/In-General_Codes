//this is the math problem known as "Collatz Conjucture" or "Ulam Conjucture" came in 1930s
//the issue with this problem is that when it reaches at 1,
//as per rule it multiply 1 by 3 and add 1 we get 4
//the 4 is divide by 2 we get 2
//then 2 is divided by 2 we get 1..... and this process continues again
//basically it gets into loop which can never stop
//youtube link to video:
//https://youtu.be/094y1Z2wpJg


package practice;

import java.util.Scanner;

public class Collatz_conjucture {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to find Hillstone");
		int n = sc.nextInt();
		
		while(n>=1) {
			if(n%2==0) {
				System.out.println(n+" is even therefore divide by 2");
				n = (n/2);
				System.out.println(n);
			}
			else {
				System.out.println(n+" is odd therefore multiply by 3 and add 1");
				n = (n*3)+1;
				System.out.println(n);
			}
		}

	}

}
