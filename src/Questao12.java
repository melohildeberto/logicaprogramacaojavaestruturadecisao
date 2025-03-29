import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        float qtdHoras;
        float valorHora;
        float salario;
        float descontoSindicato;
        float valorFgts;
        float descontoIr;
        float salarioLiquido;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Informe a quantidade de horas trabalhadas:");
        qtdHoras = entradas.nextFloat();
        System.out.println("Informe o valor da hora trabalhada:");
        valorHora = entradas.nextFloat();
        salario = qtdHoras * valorHora;

        descontoSindicato = salario * 0.03f;
        valorFgts = salario * 0.11f;

        if (salario <= 900) {
            descontoIr = 0;
        } else if (salario > 900 && salario <= 1500) {
            descontoIr = salario * 0.05f;
        } else if (salario > 1500 && salario <= 2000) {
            descontoIr = salario * 0.1f;
        } else {
            descontoIr = salario * 0.2f;
        }
        salarioLiquido = salario - descontoIr - descontoSindicato;

        System.out.println("O salário bruto R$: " + salario);
        System.out.println("O valor do FGTS R$: " + valorFgts);
        System.out.println("O valor do desconto IR R$: " + (descontoIr));
        System.out.println("O valor do desconto sindicato R$: " + (descontoSindicato));
        System.out.println("O valor dos descontos R$: " + (descontoIr + descontoSindicato));
        System.out.println("O novo salário, após o aumento. R$: " + salarioLiquido);

    }
}
