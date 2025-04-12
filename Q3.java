//r = pi
import java.util.Scanner;

public class Q3{
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double r = 3.14;
        System.out.print("Digite o raio:");
        float raio = Integer.valueOf(entrada.nextLine());
        
        double expoente =  Math.pow(raio , 2);
        double area = r * expoente;
        double comprimento = 2 * r * raio;
        System.out.println("area = "+area);
        System.out.println("comprimento = "+comprimento);
    }
}
