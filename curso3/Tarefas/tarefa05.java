package curso3.Tarefas;

import java.util.Scanner;

public class tarefa05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, senha;
        boolean senhaValida;

    System.out.println("Digite o usuário:");
    nome = teclado.nextLine();

    System.out.println("Olá "+ nome);

    System.out.println("Digite a senha:");
    senha = teclado.nextLine();

    senhaValida = senha.equals("R10p5");


    if (senhaValida) {
        System.out.println("Acesso concedido!");
    }else {
     System.out.println("Acesso negado!");
    }


        teclado.close();
    }
}
