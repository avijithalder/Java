package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter Your Letter : ");

        ch = input.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.print("Vowel");
        }
        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
        {
            System.out.print("Vowel");
        }
        else{
            System.out.print("Consonant");
        }

    }
}
