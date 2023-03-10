package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    private static FizzBuzz fizzBuzz;


    @BeforeAll
    static void setup() {
        fizzBuzz = new FizzBuzz();
    }


    @Test
    void NumeroInteiro_NumeroValido_retornaTextoNumero() {
       
        
        int entrada = 1;
        String esperado = "1";
        
        String resposta = fizzBuzz.converte(entrada);
        assertEquals(esperado, resposta);
    }

    @Test
    void NumeroMultiploDe3_NumeroValido_retornaFizz() {

        
        int entrada = 3;
        String esperado = "Fizz";
        
        String resposta = fizzBuzz.converte(entrada);
        assertEquals(esperado, resposta);
    }

    @Test
    void NumeroMultiploDe5_NumeroValido_retornaBuzz() {

        
        int entrada = 5;
        String esperado = "Buzz";
        
        String resposta = fizzBuzz.converte(entrada);
        assertEquals(esperado, resposta);
    }

    @Test
    void NumeroMultiploDe3EDe5_NumeroValido_retornaFizzBuzz() {

        
        int entrada = 15;
        String esperado = "FizzBuzz";
        
        String resposta = fizzBuzz.converte(entrada);
        assertEquals(esperado, resposta);
    }
}
