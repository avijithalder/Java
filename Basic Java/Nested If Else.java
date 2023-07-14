package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter your Number : ");
        num = input.nextInt();
        if (num > 0) {
            System.out.print(" Positive ");
        } else if (num < 0) {
            System.out.print(" Negetive ");
        } else {
            System.out.print(" Equal to Zero ");
        }
    }
}
