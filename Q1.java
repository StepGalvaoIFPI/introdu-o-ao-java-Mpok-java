import java.util.Scanner;

public class Q1{
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a base:");
        float base = Integer.valueOf(entrada.nextLine());
        System.out.print("Digite a altura:");
        float altura = Integer.valueOf(entrada.nextLine());
        
        float area = (base * altura)/2;
        System.out.println("Area = "+area);
    }
}
