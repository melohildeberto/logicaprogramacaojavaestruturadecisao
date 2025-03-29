import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        float salario;
        float aumento;
        float percentualAplicado;
        float novoSalario;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe o salário:");
        salario = entradas.nextFloat();
        if (salario <= 280) {
            percentualAplicado = 20;
            aumento = salario * 0.2f;
        }else if (salario > 280 && salario <= 700) {
            percentualAplicado = 15;
            aumento = salario * 0.15f;
        }else if (salario > 700 && salario <= 1500) {
            percentualAplicado = 10;
            aumento = salario * 0.1f;
        }else{
            percentualAplicado = 5;
            aumento = salario * 0.05f;
        }
        novoSalario = salario + aumento;

        System.out.println("O salário antes do reajuste R$: " + salario);
        System.out.println("O percentual de aumento aplicado: " + percentualAplicado);
        System.out.println("O valor do aumento R$: " + aumento);
        System.out.println("O novo salário, após o aumento. R$: " + novoSalario);

    }
}
