import java.util.Scanner;
public class Q6
{
	public static void main(String[] args) {
	    Scanner renda = new Scanner(System.in);
		System.out.print("Digite o seu salario:");
		double salario = Integer.valueOf(renda.nextLine());
		double imposto = (salario * 10) / 100;
    double salariofinal = salario - imposto;
		
		System.out.println("Salario = R$"+salario);
		System.out.println("Imposto = R$"+imposto);
		System.out.println("Salario Final =R$"+salariofinal);
	}
}
