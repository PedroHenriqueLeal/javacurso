package br.gama.itau;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SequenciaNumericaTest {
    
    private static SequenciaNumerica sn;
    private static ArrayList<Integer> lista;

    @BeforeAll
    static void setup() {

      sn = new SequenciaNumerica();
      lista = new ArrayList<>();
        
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(5);
        lista.add(7);
        lista.add(11);
    }

    @Test
    void listaNumeros_listaPossuiValores_retornaOMinimo() {
        int menorEsperada = 1;
        
        int resposta = sn.getMinimo(lista);

        assertEquals(menorEsperada, resposta);
    }

    @Test
    void listaNumeros_listaPossuiValores_retornaOMaximo() {
        int maiorEsperada = 11;
       
        int resposta = sn.getMaximo(lista);

        assertEquals(maiorEsperada, resposta);
    }

    @Test
    void listaNumeros_listaPossuiValores_retornaQuantidadeNumeros() {

        int quantidadeEsperada = 6;

        int resposta = sn.getSize(lista);

        assertEquals(quantidadeEsperada, resposta);
    }

    @Test
    void listaNumeros_listaPossuiValores_retornaAMediaDaSequencia() {

        double mediaEsperada = 4.833333333333333;

        double resposta = sn.getMedia(lista);

        assertEquals(mediaEsperada, resposta);
    }

}
