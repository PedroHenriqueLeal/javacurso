package br.gama.itau;

import java.util.ArrayList;
import java.util.Collections;

public class SequenciaNumerica {
    public int getMinimo(ArrayList<Integer> lista) {
        return Collections.min(lista);
    }

    public int getMaximo(ArrayList<Integer> lista) {
        return Collections.max(lista);
    }

    public int getSize(ArrayList<Integer> lista) {
        return lista.size();
    }

    public double getMedia(ArrayList<Integer> lista) {
        double media = 0;
        for ( Integer numero : lista) {
            media += numero;
        }
        // O size significa a lista completa da sequência
        media /= lista.size();

        return media;
    }
}
