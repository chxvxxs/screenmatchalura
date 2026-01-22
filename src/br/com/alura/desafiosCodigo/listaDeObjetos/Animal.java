package br.com.alura.desafiosCodigo.listaDeObjetos;

public class Animal {
    private String especie;
    private int idade;

    public Animal(int idade, String especie) {
        this.idade = this.idade;
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("Barulho genérico de animal");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                '}';
    }
}
