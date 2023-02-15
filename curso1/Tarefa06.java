import java.util.Scanner;

public class Tarefa06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, media;
        
        System.out.println("Digite a sua primeira nota:");
        nota1 = entrada.nextInt();

        System.out.println("Digite a sua segunda nota:");
        nota2 = entrada.nextInt();

        media = (nota1 + nota2)/2;
        System.out.println("A sua média final é: " + media);
        
        entrada.close();
    }
}
