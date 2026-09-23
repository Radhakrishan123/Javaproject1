package org.example.Controller;

import org.example.entity.Product;
import org.example.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return service.save(product);
    }

    @GetMapping
    public Page<Product> getAll(
            @RequestParam(defaultValue = "0")
            int page){

        return service.getAll(page);
    }

    @GetMapping("/search")
    public Page<Product> search(

            @RequestParam String name,

            @RequestParam(defaultValue = "0")
            int page){

        return service.search(name,page);


    }
}