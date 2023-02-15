import java.util.Scanner;

public class Tarefa05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, media;
    

        nota1 = 8;
        nota2 = 2;
        media = (nota1 + nota2)/2;

        System.out.println("A sua primeira nota é: " + nota1);
        System.out.println();
        System.out.println("A sua segunda nota é: " + nota2);
        System.out.println();
        System.out.println("A sua média final é: " + media);
        
        entrada.close();
    }
}
