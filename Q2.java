import java.util.Scanner;

public class Q2{
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a base:");
        float largura = Integer.valueOf(entrada.nextLine());
        System.out.print("Digite a altura:");
        float altura = Integer.valueOf(entrada.nextLine());
        
        float area = largura * altura;
        float perimetro = (2*altura) + (2*largura);
        System.out.println("area = "+area);
        System.out.println("perimetro = "+perimetro);
    }
}
