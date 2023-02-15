package curso3.Tarefas;

import java.util.Scanner;

public class tarefa04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, valorPrestacao;
        System.out.println("Digite seu salário bruto:");
        salarioBruto = teclado.nextDouble();
        System.out.println("Digite o valor da prestação:");
        valorPrestacao = teclado.nextDouble();

        
        if (valorPrestacao <= salarioBruto * 0.3) {
            System.out.println("Emprestimo aprovado!");
        
        }else {
            System.out.println("Emprestimo negado!");

        }

        System.out.println("Fim da execução!");


        teclado.close();

    }
}
