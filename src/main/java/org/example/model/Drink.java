package org.example.model;

public class Drink extends Product {

    private String volume;


    public Drink(String name, String description, int price, int productNumber, String volume) {
        super(name, description, price, productNumber);
        this.volume = volume;

    }



    @Override
    public String examine() {
        return getName() + "volume " + getVolume() + "price " + getPrice() + " SEK." ;
    }

    @Override
    public String use() {
        return "glung, glung glung ,,,,Ahhhhh";
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }



}