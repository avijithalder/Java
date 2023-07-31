package Hello;

import java.util.Arrays;

public class TryOn {

	public static void main(String[] args) {
		int array[] = { 10, 20 };
		
		int sum=0,avg=0;
		
		for(int i:array)
		{
			sum=sum+i;
			avg=(sum/2);
			
			
		}
		System.out.print(+avg);

	}
}
