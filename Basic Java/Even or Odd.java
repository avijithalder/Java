package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter Your Age : ");
        int num=input.nextInt();
        
        if(num%2==0)
        {
            System.out.print("Even ");
        }
      
        else
        {
            System.out.print("Odd");
        }
        
        
    
    }
}
