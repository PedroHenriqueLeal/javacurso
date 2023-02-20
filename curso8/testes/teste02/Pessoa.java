package curso8.testes.teste02;

public abstract class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // método abstrato obriga todas as classes
    // filhas a escreverem esse método
    public abstract String getDados();
    
}