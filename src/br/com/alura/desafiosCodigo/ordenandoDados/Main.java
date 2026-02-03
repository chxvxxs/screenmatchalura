package br.com.alura.desafiosCodigo.ordenandoDados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(6);
        numeros.add(1);
        numeros.add(101);
        numeros.add(22);
        numeros.forEach(System.out::println);
        System.out.println("===========================================================================");
        Collections.sort(numeros);
        numeros.forEach(System.out::println);
        System.out.println("===========================================================================");
        Titulo t1 = new Titulo("Chaves");
        Titulo t2 = new Titulo("Alice no pais das maravilhas");
        Titulo t3 = new Titulo("Espetacular Homem Aranha");
        Titulo t4 = new Titulo("Big Bang Theory");
        Titulo t5 = new Titulo("Harry Potter");


        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);
        titulos.add(t4);
        titulos.add(t5);
        Collections.sort(titulos);
        titulos.forEach(System.out::print);
        System.out.println();

        System.out.println("===========================================================================");

        LinkedList<Titulo> tituloLinkedList = new LinkedList<>();
        tituloLinkedList.add(t1);
        tituloLinkedList.add(t2);
        tituloLinkedList.add(t3);
        tituloLinkedList.add(t4);
        tituloLinkedList.add(t5);
        Collections.sort(tituloLinkedList);
        tituloLinkedList.forEach(System.out::print);
        System.out.println();

        System.out.println("===========================================================================");

        List<String> listaComPolimorfismo;
        listaComPolimorfismo = new ArrayList<>();
        listaComPolimorfismo.add("Componente 1");
        listaComPolimorfismo.add("Componente 2");
        listaComPolimorfismo.add("Componente 3");
        System.out.println("Arraylist: " + listaComPolimorfismo);

        System.out.println("===========================================================================");

        listaComPolimorfismo = new LinkedList<>();
        listaComPolimorfismo.add("Componente 1");
        listaComPolimorfismo.add("Componente 2");
        listaComPolimorfismo.add("Componente 3");
        System.out.println("LinkedList: " + listaComPolimorfismo);
    }
}
