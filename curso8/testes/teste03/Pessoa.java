package curso8.testes.teste03;

public class Pessoa {
  // criamos independência do dispositivo
    // pois não importa o dispósitivo o método imprimir sempre existe
    // recebemos o tipo de dispositivo como parâmetro no método
    public void exibirDados(DispositivoSaida saida) {
        saida.imprimir();
    }  
}
