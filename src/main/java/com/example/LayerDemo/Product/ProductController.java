package com.example.LayerDemo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/saved")
    String save() {
        Product product = new Product(111, "ipad");
        return productRepository.save(product);
    }

    @GetMapping("/found")
    String findById() {
        return productRepository.findById(111);
    }
}
