package math2;

import java.util.Scanner;

public class Table {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,k,num;
		System.out.println("Enter Number:");
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		System.out.println("The table of :"+num);
		for (i=1;i<=10;++i)
		{
			
			k=num*i;
			System.out.println(+num+" "+"*"+" "+i+" "+"="+" "+k);
			
		
		}
		
		

	}

}
