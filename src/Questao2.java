import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int numero;

        Scanner entradas = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        numero = entradas.nextInt();
        if (numero < 0) {
            System.out.println("O valor é negativo");
        }else{
            System.out.println("O valor é positivo");
        }
    }
}
