package curso11.tarefas.contas.dados;

import java.util.ArrayList;

import curso11.tarefas.contas.modelo.Conta;
import curso11.tarefas.contas.modelo.ContaCorrente;
import curso11.tarefas.contas.modelo.ContaEspecial;
import curso11.tarefas.contas.modelo.ContaPoupanca;

public class GerenciaContas {
    private ArrayList<Conta> listaDeContas;

    public GerenciaContas() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaDeContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.add(new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.add(new ContaEspecial(numeroConta, limite));
    }

    public String consultarSaldo(int numeroConta) {
        // Para cada conta da ListaDeContas
        for (Conta conta : listaDeContas) {
            // Verifique se esta conta tem o número que estamos procurando
            if (conta.getNumero() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta não encontrada";
    }

    public boolean depositar(int numeroConta, double valor) {
        // Para cada conta da ListaDeContas
        for (Conta conta : listaDeContas) {
            // Verifique se esta conta tem o número que estamos procurando
            if (conta.getNumero() == numeroConta) {
                // tenta fazer o depósito
                return conta.depositar(valor);
            }
        }
        return false; // não achou a conta
    }

    public boolean sacar(int numeroConta, double valor) {
        // Para cada conta da ListaDeContas
        for (Conta conta : listaDeContas) {
            // Verifique se esta conta tem o número que estamos procurando
            if (conta.getNumero() == numeroConta) {
                // tenta fazer o depósito
                return conta.sacar(valor);
            }
        }
        return false; // não achou a conta
    }

}




//Outra forma de resolver através do throws

// public String consultarSaldo(int numeroConta) throws ContaInexistenteException {
//     // busca a conta desejada
//     Conta conta = listaDeContas.get(numeroConta);
//     if (conta == null) {
//         throw new ContaInexistenteException("Conta não encontrada.");
//     }
//     return conta.toString();
// }

// public boolean depositar(int numeroConta, double valor) throws ContaInexistenteException {
//     Conta conta = listaDeContas.get(numeroConta);
//     if (conta == null) {
//         throw new ContaInexistenteException("Conta não encontrada.");
//     }
//     return conta.depositar(valor);
// }

// public boolean sacar(int numeroConta, double valor) throws ContaInexistenteException {
//     Conta conta = listaDeContas.get(numeroConta);
//     if (conta == null) {
//         throw new ContaInexistenteException("Conta não encontrada.");
//     }
//     return conta.sacar(valor);
// }