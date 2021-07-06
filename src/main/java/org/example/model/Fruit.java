package org.example.model;

public class Fruit extends Product{

    private String weight;



    public Fruit(String name, String description, int price, int productNumber, String weight) {
        super(name, description, price,productNumber);
        this.weight = weight;

    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }



    @Override
    public String examine() {
        return getName() + "volume " + getWeight()  + "price " + getPrice() + " SEK." ;
    }

    @Override
    public String use() {
        return "khasssm, khasssm,,,,,delicious";
    }
}
