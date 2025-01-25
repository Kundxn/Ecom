package com.money.Ecom.Service;

import com.money.Ecom.Model.Product;
import com.money.Ecom.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {

        return repo.findAll();


    }
    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }
}
