import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        a = entradas.nextInt();
        System.out.println("Informe o segundo valor");
        b = entradas.nextInt();
        System.out.println("Informe o terceiro valor");
        c = entradas.nextInt();
        // processamento
        if (a >= b && a >= c) {
            System.out.println("O maior valor é: " + a);
        }else if (b >= a && b >= c) {
            System.out.println("O maior valor é: " + b);
        }else if (c >= a && c >= b) {
            System.out.println("O maior valor é: " + c);
        }
        if (a <= b && a <= c) {
            System.out.println("O menor valor é: " + a);
        }else if (b <= a && b <= c) {
            System.out.println("O menor valor é: " + b);
        }else if (c <= a && c <= b) {
            System.out.println("O menor valor é: " + c);
        }
    }
}
