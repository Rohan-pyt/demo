package math2;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		 int n, n1 = 0, n2 = 0, n3 = 1;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n:"); // nth terms take from user
	        n = sc.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++) // upto nth terms loop will be execute
	        {
	        	n1 = n2; 
	        	n2 = n3;
	            n3 = n1 + n2;
	            System.out.print(n1+" ");
	        }

	}

}
