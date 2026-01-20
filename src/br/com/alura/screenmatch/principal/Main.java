package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The GoodFather", 2005);
        meuFilme.setDuracao(120);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração total de minutos da série lost: " + lost.getDuracao());

        var otoFilme = new Filme("Avatar", 2023);
        otoFilme.setDuracao(100);
        otoFilme.avalia(10);


        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(otoFilme);
        calc.inclui(lost);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(lost);
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracao(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(otoFilme);
        listaDeFilmes.add(filmeDoPaulo);
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNome());
        System.out.println("toString do " + listaDeFilmes.get(0).toString());


    }
}
