package curso3.Tarefas;

import java.util.Scanner;

public class tarefa02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.println("Digite a sua primeira nota:");
        nota1 = teclado.nextDouble();
        
        System.out.println();
        
        System.out.println("Digite a segunda nota:");
        nota2 = teclado.nextDouble();

        media = nota1* 0.4 + nota2* 0.6;
       if (media >=6) {
        System.out.println("Aprovado!");
       }else {
        System.out.println("Reprovado!");
       }
               
        
        teclado.close();
    }
}
