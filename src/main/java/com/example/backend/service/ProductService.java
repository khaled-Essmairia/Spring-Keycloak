package com.example.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.model.Product;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return List.of(
                new Product("id1", "XXABC", 120.00),
                new Product("id2", "XXZER", 130.00),
                new Product("id3", "XXRFR", 110.00),
                new Product("id4", "XXTER", 140.00));
    }
}
