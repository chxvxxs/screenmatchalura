package br.com.alura.desafiosCodigo.ordenandoDados;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }
    public Titulo(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int compareTo(Titulo t) {
        return this.nome.compareTo(t.nome);
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "'" + nome + '\'' +
                "} ";
    }
}
