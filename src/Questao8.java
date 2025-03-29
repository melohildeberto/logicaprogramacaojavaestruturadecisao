import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        float valorA, valorB, valorC;
        String produtoA, produtoB, produtoC;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe o nome do primeiro produto");
        produtoA = entradas.next();
        System.out.println("Informe o valor do primeiro produto");
        valorA = entradas.nextFloat();
        System.out.println("Informe o nome do segundo produto");
        produtoB = entradas.next();
        System.out.println("Informe o valor do segundo produto");
        valorB = entradas.nextFloat();
        System.out.println("Informe o nome do terceiro produto");
        produtoC = entradas.next();
        System.out.println("Informe o valor do terceiro produto");
        valorC = entradas.nextFloat();
        // processamento
        if (valorA <= valorB && valorA <= valorC) {
            System.out.println("O produto mais barato é: " + produtoA + " e custa R$: " + valorA);
        } else if (valorB <= valorA && valorB <= valorC) {
            System.out.println("O produto mais barato é: " + produtoB + " e custa R$: " + valorB);
        } else if (valorC <= valorA && valorC <= valorB) {
            System.out.println("O produto mais barato é: " + produtoC + " e custa R$: " + valorC);
        }
    }
}
