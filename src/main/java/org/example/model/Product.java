package org.example.model;

public abstract class Product {
    private String name;
    private String description;
    private int price;
    private int productNumber;


    public Product(String name, String description, int price,int productNumber){
        this.name = name;
        this.description = description;
        this.price = price;
        this.productNumber = productNumber;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public abstract String examine();


    public abstract String use();




}
