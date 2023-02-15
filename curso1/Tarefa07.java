import java.util.Scanner;

public class Tarefa07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pagamento, valorKw, qtdeKw, valorAPagar, valorComDesconto;

        System.out.println("Informe o valor do pagamento mínimo:");
        pagamento = entrada.nextDouble();

        System.out.println("Digite a quantidade de kw consumido:");
        qtdeKw = entrada.nextDouble();

        valorKw = pagamento / 500;
        valorAPagar = qtdeKw * valorKw;
        valorComDesconto = valorAPagar * 0.85;

        System.out.println("Um Kw custa: R$ " + valorKw);
        System.out.println("O valor a ser pago é: R$ " + valorAPagar);
        System.out.println("Valor com desconto: " + valorComDesconto);


        entrada.close();


    }
}
