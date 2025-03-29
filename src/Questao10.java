import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        String valorInformado;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe M (Matutino), V (Vespertino) ou N (Noturno).:");
        valorInformado = entradas.next();
        valorInformado = valorInformado.toUpperCase();
        char letra = valorInformado.charAt(0);
        if (letra == 'M') {
            System.out.println("Bom dia");
        }else if (letra == 'V') {
            System.out.println("Boa tarde");
        }else if (letra == 'N') {
            System.out.println("Boa noite");
        }else{
            System.out.println("Período inválido");
        }
    }
}
