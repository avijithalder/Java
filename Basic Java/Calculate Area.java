package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base : ");
        double base;
        base = input.nextDouble();
        
        System.out.print("Enter Height : ");
        double height;
        height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.print("  ");
        System.out.print("Area is : " +area);

    }
}
