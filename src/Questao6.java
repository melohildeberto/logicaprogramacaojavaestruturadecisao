
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        int a, b, c;
        // String nome = JOptionPane.showInputDialog("Informe o nome");
        // System.out.println(nome);
        // JOptionPane.showMessageDialog(null, nome);
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
    }
}
