package curso3.Testes;

import java.util.Scanner;

public class teste03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        
        int contador;
        contador = 1;
        while (contador<=5) {
            System.out.println("Digite a proxima nota:");
            nota = teclado.nextDouble();
            contador++;    
        }

        teclado.close();
    }
}
