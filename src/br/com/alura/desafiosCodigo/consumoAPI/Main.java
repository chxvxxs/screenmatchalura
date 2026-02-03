package br.com.alura.desafiosCodigo.consumoAPI;

import br.com.alura.desafiosCodigo.consumoAPI.Biblioteca.Livro;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo Barcelos\",\"idade\":33,\"cidade\":\"Paulista\",\"estado\":\"PE\",\"civil\":\"Solteiro\"}";
        Gson gson = new GsonBuilder()
                .setLenient()
                .serializeNulls()
                .create();
        Pessoa p = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(p);
        System.out.println("==========================================================================================================================================================");

        String jsonLivro = "{\"nome\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"anoDeLancamento\":\"2001\", \"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
        Gson g = new GsonBuilder()
                .setLenient()
                .serializeNulls()
                .create();
        Livro l = g.fromJson(jsonLivro, Livro.class);
        System.out.println(l);
    }
}
