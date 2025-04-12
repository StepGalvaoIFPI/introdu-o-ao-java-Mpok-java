import java.util.Scanner;
public class Q4
{
	public static void main(String[] args) {
	    Scanner temp = new Scanner(System.in);
		System.out.print("Digite a temperatura em Grau Celsius:");
		double c = Integer.valueOf(temp.nextLine());
		
		double f = c * 1.8 + 32;
		double k = (f + 459.67) / 1.8;
		
		System.out.println("Celsius = "+c);
		System.out.println("Fahrenheit = "+f);
		System.out.println("Kelvin = "+k);
	}
}
