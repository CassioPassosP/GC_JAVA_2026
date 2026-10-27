package com.example.apirestwithspring.services;

import ch.qos.logback.core.joran.spi.HttpUtil;
import com.example.apirestwithspring.entities.Pokemon;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Objects;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class PokemonService {
    private final RestClient client;

    public PokemonService(RestClient.Builder builder) {
        this.client = RestClient.builder().baseUrl("https://pokeapi.co/api/v2").build();
    }

    public String getPokemonByName (String pokemon_name){
       return  Objects.requireNonNull(client.get()
                       .uri("/pokemon/{pokemon_name}", pokemon_name)
                       .retrieve()
                       .body(Pokemon.class))
                       .toString();
    }
}
