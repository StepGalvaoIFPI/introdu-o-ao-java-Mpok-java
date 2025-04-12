import java.util.Scanner;
public class Q7
{
	public static void main(String[] args) {
	    Scanner vento = new Scanner(System.in);
		System.out.print("Digite a distância percorrida em km:");
		float distancia = Integer.valueOf(vento.nextLine());
		System.out.print("Digite a sua velocidade:");
		float km = Integer.valueOf(vento.nextLine());
		
		float tempo = distancia * km;
		
		System.out.println("Tempo: "+tempo+"h");
	}
}
