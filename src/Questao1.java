
import java.util.Scanner;

public class Questao1{
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner entradas = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        numero1 = entradas.nextInt();
        System.out.println("Informe o segundo valor:");
        numero2 = entradas.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro valor é o maior");
        }else if(numero2 > numero1){
            System.out.println("O segundo valor é o maior");
        }else{
            System.out.println("Os valores são iguais");
        }
    }
}