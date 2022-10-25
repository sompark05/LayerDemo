package com.example.LayerDemo.Product;

public class Product {

    private int pid;
    private String name;

    Product(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getPid() {
        return pid;
    }
}
