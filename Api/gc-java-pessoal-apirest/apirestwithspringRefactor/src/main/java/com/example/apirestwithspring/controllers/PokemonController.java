package com.example.apirestwithspring.controllers;

import com.example.apirestwithspring.entities.Pokemon;
import com.example.apirestwithspring.entities.Product;
import com.example.apirestwithspring.services.PokemonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokeApi")
public class PokemonController {

    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    @GetMapping("/pokemon/{pokemon_name}")
    public String whoIsThatPokemon (@PathVariable String pokemon_name) {
        return service.getPokemonByName(pokemon_name);
    }

}
