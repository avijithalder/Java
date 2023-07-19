package For_Own;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many times Want to Print Bangladesh ");
		
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+ "Bangladesh");
		}
		
		

		

	}
}
