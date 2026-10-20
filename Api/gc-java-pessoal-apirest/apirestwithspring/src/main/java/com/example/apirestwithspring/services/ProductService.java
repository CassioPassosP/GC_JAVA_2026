package com.example.apirestwithspring.services;

import com.example.apirestwithspring.entities.Product;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ProductService {

    private final RestClient client;

    public ProductService(RestClient.Builder builder) {
        this.client = builder.baseUrl("https://dummyjson.com").build();
    }

    public Product addANewProduct (Product product){
       return client.post()
                .uri("/products/add")
                .contentType(MediaType.APPLICATION_JSON)
                .body(product)
                .retrieve()
                .body(Product.class);
    }

    public Product deleteProduct (Product product){
        return client.delete()
                .uri("/products/delete")
                .retrieve()
                .body(Product.class);
    }

    public Product getProduct (Product product){
        return client.get()
                .uri("/products/get")
                .retrieve()
                .body(Product.class);
    }

    public Product updateProduct (Product product){
        return client.put()
                .uri("/products/update")
                .retrieve()
                .body(Product.class);
    }

    //    public Pokemon setPokemonByName (Pokemon pokemon){
//        ResponseEntity<Void> response = client.post()
//                .uri("/pokemon/")
//                .contentType(APPLICATION_JSON)
//                .body(pokemon)
//                .retrieve()
//                .toBodilessEntity();
//
//        return pokemon;
//    }
}
