package math2;

import java.util.Scanner;

public class ReversedInput {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int input;
		System.out.println("Enter the Number:");
		
		Scanner sc =new Scanner (System.in);
		input = sc.nextInt();
	
		int output=0;
		while(input>0)
		{
			
				output= output*10+input%10;
				input=input/10;
	
		}
		System.out.println("Reversed input: "+output);
	}

}
