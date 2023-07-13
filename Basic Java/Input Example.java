
package Practice;

import java.util.Scanner;

public class InputDemo {
    
   public static void main(String[] args)
   {
       System.out.print("Enter Your ID : ");
       Scanner input = new Scanner(System.in);
       int number;
       number=input.nextInt();
       
       System.out.print("Enter Your Title : ");
       Scanner input1 = new Scanner(System.in);
       String data;
       data=input1.next();
       
       System.out.print("Enter Your Product Price : ");
       Scanner input2=new Scanner(System.in);
       double data2;
       data2=input2.nextDouble();
       
       System.out.print("Enter product Derscription : ");
       Scanner input3=new Scanner(System.in);
       String data3;
       data3=input3.nextLine();
       
       System.out.println(  );
       System.out.println("ID : "+number);
       System.out.println("Title : "+data);
       System.out.println("Price : "+data2);
       System.out.println("Description : "+data3);
   }
    
  }
