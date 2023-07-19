package For_Own;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter number : ");
		Scanner input=new Scanner(System.in);
		
		int number=input.nextInt();
		
		switch(number)
		{
			case 0:
				System.out.print("Zero"); 
				break;
			case 1:
				System.out.print("One"); 
				break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three"); 
				break;
			default:
				System.out.print("Not a Number ");
	
				
		}
		
}
}
