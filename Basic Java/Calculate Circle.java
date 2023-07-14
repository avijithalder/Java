package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entter Radius : ");
        double radius;
        radius = input.nextDouble();

        double circle = 3.1416 * radius * radius;
        
        System.out.print("Area Of Circul : "+circle);

    }
}
