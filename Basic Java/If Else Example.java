package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter Your Age : ");
        int age=input.nextInt();
        
        if(age==18)
        {
            System.out.print("Valid Voter ");
        }
        else if(age>18)
                {
                    System.out.print("Valid Voter ");
                }
        else{
            System.out.print("Invalid Voter ");
        }
        
        
    
    }
}
