package curso4.testes.teste03;

public class Pessoa {
     //vcaracteristicas = ATRIBUTOS
     String nome;
     int idade;
 
    // ações = MÉTODOS
     void apresentar() {
         System.out.println("Olá1 Eu sou o(a) "+ nome);
         System.out.println("Tenho "+ idade + " anos");
     }
 
     Pessoa(String novoNome, int novaIdade) {
         //nome = "Sem nome";
         //idade = 18;
       nome = novoNome;
       idade = novaIdade;
     }
}
