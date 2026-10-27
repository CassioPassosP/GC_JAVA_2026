package com.example.apirestwithspring.controllers;

import com.example.apirestwithspring.entities.Product;
import com.example.apirestwithspring.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productApi")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("/product/add/{product_name}")
    public Product createProduct(@PathVariable String product_name) {
       return service.addANewProduct(new Product(product_name));
    }

    @DeleteMapping("/product/delete/{product_name}")
    public Product deleteProduct(@PathVariable String product_name) {
        return service.deleteProduct(new Product(product_name));
    }

    @GetMapping("/product/get/{product_name}")
    public Product foundProduct(@PathVariable String product_name) {
        return service.getProduct(new Product(product_name));
    }

    @PutMapping("/product/put/{product_name}")
    public Product updateProduct(@PathVariable String product_name) {
        return service.updateProduct(new Product(product_name));
    }

}
