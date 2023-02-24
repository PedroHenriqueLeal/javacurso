package curso10.testes.teste08;

import java.io.FileReader;
import java.io.IOException;

public class Teste08Leitura {

    public static void main(String[] args) throws IOException {
        FileReader fReader = new FileReader("curso10/testes/teste08/arquivo.txt");
        String saida = "";
        int letra;

        // lê o arquivo letra por letra, e quando terminar o método read retorna -1
        while ( (letra = fReader.read()) != -1) {
            saida = saida + (char) letra;
        }

        System.out.println(saida);

        fReader.close();
    }
}
