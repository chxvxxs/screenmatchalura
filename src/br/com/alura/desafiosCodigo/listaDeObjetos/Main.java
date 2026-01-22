package br.com.alura.desafiosCodigo.listaDeObjetos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");
        listaDeNomes.add("Gio");
        listaDeNomes.forEach(System.out::println);

        Cachorro cachorro = new Cachorro(5, "pitbull");
        System.out.println("=== ANTES DO CASTING (Referência Cachorro) ===");
        System.out.println("Idade: " + cachorro.getIdade());
        System.out.println("Raça: " + cachorro.getEspecie());
        Animal animal = (Animal)cachorro;
        System.out.println("\n=== DEPOIS DO CASTING (Referência Animal) ===");
        System.out.println("Nome: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade());
        cachorro.abanarRabo();

    }
}
