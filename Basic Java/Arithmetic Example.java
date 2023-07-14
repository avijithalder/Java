package Practice;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int phonePrice = 1800; // 1800 euros
            int numberOfInstallment;
            int installmentPerMonth;

            System.out.print("Number of installments? ");
            numberOfInstallment = input.nextInt();

            installmentPerMonth = (phonePrice / numberOfInstallment);
            System.out.println("Monthly installment Amount: " + installmentPerMonth + " euros");

        }
    }
}
