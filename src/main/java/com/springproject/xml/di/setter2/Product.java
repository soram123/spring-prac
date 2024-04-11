package com.springproject.xml.di.setter2;

public class Product {
    private int productId;
    private String productName;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void getProductDetails(){
        System.out.println("from product class");
        System.out.println(productId);
        System.out.println(productName);
    }
}
