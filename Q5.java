import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) {
	    Scanner renda = new Scanner(System.in);
		System.out.print("Digite o seu salario:");
		double salario = Integer.valueOf(renda.nextLine());
		double imposto = (salario * 10) / 100;
		
		System.out.println("Salario = R$"+salario);
		System.out.println("Imposto = R$"+imposto);
	}
}
