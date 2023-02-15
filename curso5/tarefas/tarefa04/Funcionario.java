package curso5.tarefas.tarefa04;

public class Funcionario {
    private String nome;
    private double valorPorHoras;

    public Funcionario(String nome, double valorPorHoras) {
        this.nome = nome;
        this.valorPorHoras = valorPorHoras;
    }

    public void setvalorPorHoras(double novoValor) {
        valorPorHoras = novoValor;
    }

    public String exibir() {
        return nome + " - R$ " + valorPorHoras;
    }

    public double calcularSalario(double numeroHoras) {
        return valorPorHoras * numeroHoras;

    }
}
