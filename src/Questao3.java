import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        String valorInformado;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe o sexo M ou F:");
        valorInformado = entradas.next();
        valorInformado = valorInformado.toUpperCase();
        char letra = valorInformado.charAt(0);
        if (letra == 'M') {
            System.out.println("Masculino");
        }else if (letra == 'F') {
            System.out.println("Feminino");
        }else{
            System.out.println("Sexo inválido");
        }
      
    }
}
