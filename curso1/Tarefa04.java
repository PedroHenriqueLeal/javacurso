import java.util.Scanner;

public class Tarefa04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine();

        System.out.println("Olá " + nome);

        entrada.close();

    }
}
