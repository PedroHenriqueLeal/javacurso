package curso10.testes.teste08;

import java.io.FileWriter;
import java.io.IOException;

/* 
 * Escrevendo conteúdo diretamente dentro do arquivo
 * 
 */
public class Teste08 {
    public static void main(String[] args) throws IOException {
        // abre o arquivo para gravação
        // se colocar true no final, a classe vai acrescentar ao final e não apagar
        FileWriter fWriter = new FileWriter("curso10/testes/teste08/arquivo.txt", true);
        
        String texto = "\nLinha de texto\nOutra linha";

        // escreve dentro do arquivo
        fWriter.write(texto);

        fWriter.close();
    }
}
