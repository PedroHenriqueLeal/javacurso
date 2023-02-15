package curso3.Tarefas;

import java.util.Scanner;

public class tarefa01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.println("Dgite o valor inteiro:");
        numero = teclado.nextDouble();
        if ( numero >=20) {
        System.out.println(numero/2);
            
        }

        teclado.close();
    }
}
