package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter your Number : ");
        num = input.nextInt();
        if (num > 0) {
            System.out.print(num + " Positive ");
        } else {
            System.out.print(num + " Negetive ");
        }
    }
}
