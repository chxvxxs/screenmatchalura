package br.com.alura.desafiosCodigo.listaDeObjetos;

public class Cachorro extends Animal {

    public Cachorro(int idade, String especie) {
        super(idade, especie);
    }

    public void emitirSom(){
        System.out.println("Au Au");
    }
    public void abanarRabo() {
        System.out.println( " está abanando o rabo!");
    }
}
