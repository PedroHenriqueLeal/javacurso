package curso5.tarefas.tarefa02;

public class Proprietario {
    private String nome, telefone;

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getDados() {
        return nome + ", " + telefone;
    }

    public void setTelefone(String novoTelefone) {
        telefone = novoTelefone;
}
}
