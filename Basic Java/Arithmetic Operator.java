package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fisrt number : ");
        int num1 = input.nextInt();

        System.out.print("Enter Second number : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int Multi = num1 * num2;
        int Div = num1 / num2;
        int Rem = num1 % num2;

        System.out.println("    ");
        System.out.println("Sumation : " + sum);
        System.out.println("substraction : " + sub);
        System.out.println("Multiplication : " + Multi);
        System.out.println("Division : " + Div);
        System.out.println("Remminder : " + Rem);

    }
}
