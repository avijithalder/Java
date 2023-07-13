
package Practice;

import java.util.Scanner;

public class InputDemo {
    
    public static void main(String[] args)
    {
        System.out.print("Enter Your Name : ");
        
        Scanner input=new Scanner(System.in);
        
        String data;
        data=input.nextLine();
        System.out.print("Your Name is : "+data);
    }    
    
  }
