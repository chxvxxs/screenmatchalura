package br.com.alura.desafiosCodigo.exceptions;
import br.com.alura.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
public class GithubAPIConsumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username que deseja procurar: ");
        String username = sc.nextLine();
        HttpClient client = HttpClient.newHttpClient();

        try{
            String endereco = "https://api.github.com/users/" + username;
            HttpRequest request = HttpRequest.newBuilder()
                    .header("Accept", "application/vnd.github.v3+json")
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGithubException("Usuário não encontrado no GitHub.");
            }
            String json = response.body();
            System.out.println("Status: " + response.statusCode());
            System.out.println(json);

        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }catch (ErroConsultaGithubException e){
            String codeError = e.getMessage();
            System.out.println("Ouve um erro no sistema, ERRO: { " + codeError + "}");
        }
    }
}
class ErroConsultaGithubException extends RuntimeException{
    private String mensagem;
    public ErroConsultaGithubException(String s){
        this.mensagem = s;
    }
    @Override
    public String getMessage(){
        return mensagem;
    }
}
