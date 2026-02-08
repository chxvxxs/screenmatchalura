package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Informe o filme que deseja buscar: ");
            busca = sc.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            try {
                String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=8e0bd298";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println("Status: " + response.statusCode());
                System.out.println(json);

                //Titulo t  = gson.fromJson(json, Titulo.class);
                TituloOmdb t = gson.fromJson(json, TituloOmdb.class);
                System.out.println(t);
                Titulo titulo = new Titulo(t);
                System.out.println(titulo);

                titulos.add(titulo);
            } catch (NumberFormatException e) {
                String codeError = e.getMessage();
                System.out.println("Ouve um erro no sistema, ERRO: {" + codeError + "}");
            } catch (IllegalArgumentException e) {
                String cdError = e.getMessage();
                System.out.println("Ouve um erro no sistema, ERRO: {" + cdError + "}");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("O programa finalizou corretamente");


    }
}

