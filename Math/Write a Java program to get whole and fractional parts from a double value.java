package Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value = 12.56;
		double FractionalPart = value % 1;
		double IntegralPart = value - FractionalPart;
		System.out.println("Orginal Value :" + value);
		System.out.println("Fractional Part: " + FractionalPart);
		System.out.println("IntegralPart:" + IntegralPart);

	}

}
