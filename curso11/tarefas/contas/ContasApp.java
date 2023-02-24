package curso11.tarefas.contas;

import java.util.ArrayList;
import java.util.Scanner;

import curso11.tarefas.contas.modelo.Conta;
import curso11.tarefas.contas.modelo.ContaCorrente;
import curso11.tarefas.contas.modelo.ContaEspecial;
import curso11.tarefas.contas.modelo.ContaPoupanca;

public class ContasApp {
    public static void main(String[] args) {
        ArrayList<Conta> listaDeContas = new ArrayList<>(); // O ArrayList significa um conjunto de variáveis infinitas para ser implementada;
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int numeroConta;
        double limite, valor;

        while (opcao !=7) {
           System.out.println("1- Nova Conta Corrente");
           System.out.println("2- Nova Conta Poupança"); 
           System.out.println("3- Nova Conta Especial");
           System.out.println("4- Consultar Saldo");
           System.out.println("5- Depositar");
           System.out.println("6- Sacar");
           System.out.println("7- Sair");
           System.out.print("---->");
           
           switch (opcao) {
            case 1:
                System.out.println("Informe o número da Conta:");
                numeroConta = scanner.nextInt();
                ContaCorrente cc = new ContaCorrente(numeroConta);
                listaDeContas.add(cc);
                // Outra forma de fazer 
                // Apagar ---> ContaCorrente cc = new ContaCorrente(numeroConta);
                // Substituir ---> listaDeContas.add(new ContaCorrente(numeroConta));
                break;
            
            case 2:
                System.out.println("Informe o número da Conta:");
                numeroConta = scanner.nextInt();
                ContaPoupanca cp = new ContaPoupanca(numeroConta);
                listaDeContas.add(cp);
                // Outra forma de fazer 
                // Apagar ---> ContaPoupanca cp = new ContaPoupanca(numeroConta);
                // Substituir ---> listaDeContas.add(new ContaPoupanca(numeroConta));
                break;
                
            case 3:
                System.out.println("Informe o número da Conta:");
                numeroConta = scanner.nextInt();
                System.out.println("Informe o valor do limite:");
                limite = scanner.nextDouble();
                ContaEspecial ce = new ContaEspecial(numeroConta, limite);
                listaDeContas.add(ce);
                // Outra forma de fazer 
                // Apagar ---> ContaEspecial ce = new ContaEspecial(numeroConta);
                // Substituir ---> listaDeContas.add(new ContaEspecial(numeroConta));
                break;

            case 4:
               System.out.println("Informe o número da conta:");
               numeroConta = scanner.nextInt();
               // Para cada conta da ListaDeContas
               for (Conta conta : listaDeContas) {
                // Verifique se esta conta tem o número que estamos procurando
                if (conta.getNumero() == numeroConta) {
                    System.out.println(conta);
                    break; // quando achou, interrompe o for
                }
            }
                break;

            case 5:
               System.out.println("Informe o número da conta");
                numeroConta = scanner.nextInt();
                System.out.println("Qual o valor do depósito: ");
                valor = scanner.nextDouble();
             // Para cada conta da ListaDeContas
                for (Conta conta : listaDeContas) {
                // Verifique se esta conta tem o número que estamos procurando
                if (conta.getNumero() == numeroConta) {
                    // tenta fazer o depósito
                    if(conta.depositar(valor)){ // se o depósito foi feito
                        System.out.println("Deposíto realizado");
                        System.out.println(conta);
                    } else { // se deu erro no depósito
                        System.out.println("Falha ao depositar.");
                    }
                    break; // quando achou, interrompe o for
                }
            }         
                break;

            case 6:
            System.out.println("Informe o número da conta");
            numeroConta = scanner.nextInt();
            System.out.println("Qual o valor do saque: ");
            valor = scanner.nextDouble();
            // Para cada conta da ListaDeContas
            for (Conta conta : listaDeContas) {
                // Verifique se esta conta tem o número que estamos procurando
                if (conta.getNumero() == numeroConta) {
                    // tenta fazer o depósito
                    if (conta.sacar(valor)) { // se o saque foi feito
                        System.out.println("Saque realizado");
                        System.out.println(conta);
                    } else { // se deu erro no saque
                        System.out.println("Falha ao sacar.");
                    }
                    break; // quando achou, interrompe o for
                }
            }   
                break;

            case 7:  
                break;
           
            default:
            System.out.println("Opção inválida");
                break;
           }
        }
    scanner.close();
    }
}






//     public static void main(String[] args) {
//         Conta c1 = new ContaCorrente(123);

//         System.out.println(c1);

//         c1.depositar(100);
//         System.out.println(c1);

//         c1.sacar(50);
//         System.out.println(c1);

//         c1.sacar(-50);
//         System.out.println(c1);
//     }
// }




//Possui outra forma de resolver





//  public static void main(String[] args) {
//      Conta c1 = new ContaPoupanca(123);

//      System.out.println(c1);
    
//      // método static chama a patir da classe
//      ContaPoupanca.setTaxaSaque(0.1);

//      c1.depositar(100);
//      System.out.println(c1);

//      if(c1.sacar(100)) {
//     System.out.println("Sucesso");
//      System.out.println(c1);
//      }else {
//     System.out.println("Não foi possível fazer o saque");
//      }

//      if (c1.sacar(50)) {
//         System.out.println("Sucesso");
//         System.out.println(c1);
//     } else {
//         System.out.println("Não foi possível fazer o saque");
//     }

//      if(c1.sacar(100)) {
//     System.out.println("Sucesso");
//      System.out.println(c1);
//      }else {
//     System.out.println("Não foi possível fazer o saque");
//       }

//       c1.sacar(-50);
//         System.out.println(c1); 
//  }
// }