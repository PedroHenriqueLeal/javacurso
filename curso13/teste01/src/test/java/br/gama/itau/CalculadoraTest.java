package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraTest {
    
    @BeforeEach
    void setup() {
        System.out.println("Preparando...");
    }
   
   
   
    @ParameterizedTest
    @CsvSource({"10,20","0,-2","0,0"})
    public void soma_retornaASoma_quandoDoisValoresValidos(int valor1, int valor2) {

        // Preparação
        int esperado = valor1 + valor2;
        
        // Execução
        int resposta = Calculadora.soma(valor1 , valor2);
       
        //Verificação
        assertEquals(esperado, resposta);
    }

    @Test
    @DisplayName("Valida diferença entre números")
    public void soma_retornaASoma_quandoValorZeroEUmNegativo() {

        // Preparação
        int valor1 = 0;
        int valor2 = -2;
        
        // Execução
        int resposta = Calculadora.soma(valor1 , valor2);
       
        //Verificação
        assertEquals(-2, resposta);
    }


    @Test
    public void subtracao_retornaADiferenca_quandoDoisValoresValidos() {

        // Preparação
        int valor1 = 20;
        int valor2 = 10;
        
        // Execução
        int resposta = Calculadora.subtracao(valor1 , valor2);
       
        //Verificação
        assertEquals(10, resposta);
    }

    @Test
    public void multiplicacao_retornaMultiplicacao_quandoDoisValoresValidos() {

        // Preparação
        int valor1 = 20;
        int valor2 = 10;

       // Execução
        int resposta = Calculadora.multiplicacao(valor1, valor2);

        //Verificação
        assertEquals(200, resposta);

    
    }

    @Test
    public void divisao_retornaDivisao_quandoDoisValoresValidos() {

        // Preparação
        int valor1 = 20;
        int valor2 = 10;

        // Execução
        int resposta = Calculadora.divisao(valor1, valor2);

        //Verificação
        assertEquals(2, resposta);

    
    }

    @Test
    public void divisao_retornaDivisaoInteira_quandoONumeradoNaoForDivisivel() {

        // Preparação
        int valor1 = 15;
        int valor2 = 2;
        
        // Execução
        int resposta = Calculadora.divisao(valor1, valor2);

        //Verificação
        assertEquals(7, resposta);

    
    }

    @Test
    public void divisao_retornaZero_quandoODenominadorForZero() {

        // Preparação
        int valor1 = 15;
        int valor2 = 0;

       // Execução
        int resposta = Calculadora.divisao(valor1, valor2);

        //Verificação
        assertEquals(0, resposta);

    
    }

}





