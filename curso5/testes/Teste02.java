package curso5.testes;

import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   
        String nome[] = new String[7];

       for (int i = 0; i < nome.length; i++) {
        System.out.printf("Digite o %dº nome: ", i+ 1);
        nome[i] = teclado.nextLine();
       }

       System.out.println("Nomes lidos:");
       for (int i = nome.length - 1; i >= 0; i--) {
        System.out.println("Nome: " + nome[i]);
        
       }

       teclado.close();
    }
}
