package curso4.testes.teste03;

public class Teste03 {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Pedro",23);
        Pessoa pessoa2 = new Pessoa("Duda",21);

       // pessoa1.nome = "Pedro";
       // pessoa1.idade = 23;
       // pessoa2.nome = "Duda";
       // pessoa2.idade = 21;

       // System.out.println(pessoa1.nome);
       // System.out.println(pessoa2.nome);

       pessoa1.apresentar();
       pessoa2.apresentar();
    }
}
