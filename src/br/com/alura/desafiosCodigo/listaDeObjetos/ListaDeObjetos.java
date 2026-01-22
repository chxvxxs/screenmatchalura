package br.com.alura.desafiosCodigo.listaDeObjetos;

import java.util.ArrayList;

public class ListaDeObjetos {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jao");
        nomes.add("Jeca");
        nomes.add("Juca");
        nomes.add("Juan");
        nomes.forEach(System.out::println);

    }
}
