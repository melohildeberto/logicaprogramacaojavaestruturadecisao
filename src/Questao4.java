import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        String valorInformado;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe uma letra:");
        valorInformado = entradas.next();
        valorInformado = valorInformado.toUpperCase();
        char letra = valorInformado.charAt(0);
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("Vogal");
        }else{
            System.out.println("Consoante");
        }
      
    }
}
