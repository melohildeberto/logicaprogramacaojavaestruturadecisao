
import javax.swing.JOptionPane;

public class Questao6_2 {
    public static void main(String[] args) {
        int a, b, c;
        String valor = JOptionPane.showInputDialog("Informe o primeiro valor");
        
        a = Integer.parseInt(valor);
        //o conteúdo da variável valor deverá ser compatível com um int
        JOptionPane.showMessageDialog(null, "Resultado: " +(a * 10));
        // processamento
        /*if (a >= b && a >= c) {
            System.out.println("O maior valor é: " + a);
        }else if (b >= a && b >= c) {
            System.out.println("O maior valor é: " + b);
        }else if (c >= a && c >= b) {
            System.out.println("O maior valor é: " + c);
        }*/
    }
}
