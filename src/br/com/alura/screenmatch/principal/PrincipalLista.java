package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.*;

public class PrincipalLista {
    public static void main(String[] args) {
        var meuFilme = new Filme("The GoodFather", 2005);
        var otoFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(otoFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);
        meuFilme.avalia(9);
        otoFilme.avalia(10);
        filmeDoPaulo.avalia(10);



        System.out.println(lista);
        System.out.println("===========");
        for (Titulo item : lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Chavs");
        buscaPorArtista.add("Chaves");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista); //Ordena por ordem alfabética as strings
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.printf("Lista de filmes em ordem alfabética: %s \n", lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
