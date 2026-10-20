package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        // 1. Criar o cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // 2. Criar a requisição GET
        HttpRequest get_request = HttpRequest.newBuilder()
                .uri(new URI("https://pokeapi.co/api/v2/pokemon/ditto"))
                .GET()
                .build();

        // 3. Enviar a requisicao e informar qual o tipo da resposta
        HttpResponse<String> response = client.send(get_request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response);
        System.out.println(response.body());

    }
}