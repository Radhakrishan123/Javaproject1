package org.example.Service;

import jakarta.persistence.*;
import jakarta.persistence.criteria.*;

import org.example.entity.Product;
import org.example.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    // Pagination + Sorting
    @Override
    public Page<Product> getAll(int page) {

        Pageable pageable =
                PageRequest.of(page, 2, Sort.by("price"));

        return repository.findAll(pageable);
    }

    // Criteria API
    @Override
    public Page<Product> search(String name, int page) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Product> cq =
                cb.createQuery(Product.class);

        Root<Product> root = cq.from(Product.class);

        cq.where(
                cb.like(root.get("name"),
                        "%" + name + "%")
        );

        cq.orderBy(cb.asc(root.get("price")));

        List<Product> list =
                entityManager.createQuery(cq)
                        .setFirstResult(page * 2)
                        .setMaxResults(2)
                        .getResultList();

        return new PageImpl<>(
                list,
                PageRequest.of(page,2),
                10
        );
    }
}