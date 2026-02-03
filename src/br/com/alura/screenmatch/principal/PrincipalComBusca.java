package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();
        System.out.println("Informe o filme que deseja buscar: ");
        var busca = sc.nextLine();


        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=8e0bd298";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println("Status: " + response.statusCode());
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        //Titulo t  = gson.fromJson(json, Titulo.class);
        TituloOmdb t = gson.fromJson(json, TituloOmdb.class);
        System.out.println(t);

        Titulo titulo = new Titulo(t);
        System.out.println(titulo);

    }
}
