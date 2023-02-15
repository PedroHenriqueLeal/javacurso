package curso4.tarefas.tarefa01;

import java.util.Scanner;

public class Tarefa01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro");
        numero = entrada.nextInt();
   
        par(numero);


    entrada.close();

    }
static void par(int valor) {
            int sobra;
            
            sobra = valor % 2;

            if (sobra == 0) {
                System.out.println(valor + " é par");     
            }else {
                System.out.println(valor + "é impar");
            }

           
        }
}
