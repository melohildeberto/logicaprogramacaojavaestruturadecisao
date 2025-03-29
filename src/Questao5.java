
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float media;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        nota1 = entradas.nextFloat();
        System.out.println("Informe a segunda nota:");
        nota2 = entradas.nextFloat();
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Primeira nota não é valida");
        } else if (nota2 < 0 || nota2 > 10) {
            System.out.println("Segunda nota não é valida");
        } else {
            media = (nota1 + nota2) / 2;

            if (media == 10) {
                System.out.println("Aprovado com mérito");
            } else if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
