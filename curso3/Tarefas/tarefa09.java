package curso3.Tarefas;

import java.util.Scanner;

public class tarefa09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int limite;

        numero = 1;
        System.out.println("Informe o valor limite");
        limite = entrada.nextInt();

        while (numero <= limite) {
        System.out.print(numero + ", ");
        numero = numero * 2;
        }

        entrada.close();
    }

}
