package curso3.Tarefas;

import java.util.Scanner;

public class tarefa08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorTabuada, contador, resultado;
        System.out.println("Digite o valor da tabuada desejada:");
        valorTabuada = teclado.nextInt();
        contador = 0;
        
        while (contador <=10) {
            resultado = valorTabuada * contador;
            System.out.println(valorTabuada + " x " + contador + " = " + resultado);
            contador++;

        }
        
        teclado.close();
    }
}
