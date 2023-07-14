package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Temparature ");

        // Celsius  To Fahrenheit 
        double celsius;
        celsius = input.nextDouble();
        double CTF = (1.8 * celsius) + 32;
        System.out.print("Fahrenheit : " + CTF);

        System.out.println(" ");

        System.out.print("Enter Your Temparature ");
        double fahrenheit;
        fahrenheit = input.nextDouble();
        double FTC = (fahrenheit - 32) * 0.56;

        System.out.print("Celsius : " + FTC);

    }
}
