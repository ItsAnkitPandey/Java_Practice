package com.wipro.main;

import com.wipro.bean.Product;

class MainProduct{
    public static void main(String[] args){
        Product product1 = new Product();
        product1.displayProductDetails();

        Product product2 = new Product(102,"Mobile", 45000);
        product2.displayProductDetails();
    }
} 