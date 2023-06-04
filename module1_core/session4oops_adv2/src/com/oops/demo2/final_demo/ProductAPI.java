package com.oops.demo2.final_demo;

public class ProductAPI {

    public static void main(String[] args) {

        Product product=new Product(1,"Laptop",670000);

        getProductTaxation(product);
    }

    private static void getProductTaxation(final  Product product) {
      product.setPrice(product.getPrice()*1.5);

    }
}
