import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        int a, b, c;
        int maior = 0;
        int menor = 0;
        int meio = 0;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        a = entradas.nextInt();
        System.out.println("Informe o segundo valor");
        b = entradas.nextInt();
        System.out.println("Informe o terceiro valor");
        c = entradas.nextInt();
        // processamento
        if (a >= b && a >= c && b >= c) {
            maior = a;
            meio = b;
            menor = c;
        }else if (a >= b && a >= c && c >= b) {
            maior = a;
            meio = c;
            menor = b;
        }//competar os else ifs

        if (a >= b && a >= c) {
            maior = a;
            if (b >= c) {
                meio = b;
                menor = c;
            }else{
                meio = c;
                menor = b;
            }
        } else if (b >= a && b >= c) {
            maior = b;
            if (a >= c) {
                meio = a;
                menor = c;
            }else{
                meio = c;
                menor = a;
            }
        } else if (c >= a && c >= b) {
            maior = c;
            if (b >= a) {
                meio = b;
                menor = a;
            }else{
                meio = a;
                menor = b;
            }
        }
        System.out.println("Ordem decrescente: " + maior + ", " + meio + ", " + menor);
    }
}
