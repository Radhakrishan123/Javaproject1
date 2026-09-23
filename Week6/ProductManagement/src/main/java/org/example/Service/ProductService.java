package org.example.Service;

import org.example.entity.Product;
import org.springframework.data.domain.Page;

public interface ProductService {

    Product save(Product product);

    Page<Product> getAll(int page);

    Page<Product> search(String name, int page);

}