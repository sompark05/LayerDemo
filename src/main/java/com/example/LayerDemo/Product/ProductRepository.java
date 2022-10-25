package com.example.LayerDemo.Product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    Map<Integer, Product> db;

    ProductRepository(HashMap<Integer, Product> db) {
        this.db = db;
    }

    String save(Product product) {
        db.put(product.getPid(), product);
        return "saved";
    }

    String findById(Integer pid) {
        System.out.println(db.get(pid).getName());
        return "found";
    }
}
