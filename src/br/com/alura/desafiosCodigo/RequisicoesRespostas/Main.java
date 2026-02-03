package br.com.alura.desafiosCodigo.RequisicoesRespostas;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o livro que deseja buscar: ");
        var busca = sc.nextLine();

        HttpClient client = HttpClient.newHttpClient();

        String chave = "AIzaSyDVhGrUxJsgBYnMLjosmuFlV9kEm9Gau7I";

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=" + chave;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        sc.next();
        var nomeReceita = sc.nextLine();

        String endereco1 = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;

        HttpClient client1 = HttpClient.newHttpClient();
        HttpRequest request1 = HttpRequest.newBuilder().uri(URI.create(endereco1)).build();
        HttpResponse<String> response1 = client1.send(request1, HttpResponse.BodyHandlers.ofString());


        System.out.println("Status: " + response1.statusCode());
        System.out.println(response1.body());
        System.out.println("==================================================================================================================================================================");
        System.out.println("Status: " + response.statusCode());
        System.out.println(response.body());

    }
}
