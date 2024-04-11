package com.springproject.xml.di.setter2;

public class Category {
    private int categoryId;
    private String categoryName;
    private Product product;

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void getDetailsCategory(){
        System.out.println("from category class");
        System.out.println(categoryId);
        System.out.println(categoryName);
        product.getProductDetails();
    }
}
