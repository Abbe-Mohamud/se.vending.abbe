package org.example.Machine;
import org.example.model.Currency;

import org.example.model.Product;


public class StandardVendingMachine implements VendingMachine {

    int depositPool;
    Product[] stockedProducts;

    //Currency c = new Currency();

    public StandardVendingMachine( Product[] stockedProducts) {
        depositPool = 0;
        this.stockedProducts = stockedProducts;
    }

    public void addCurrency(int amount){
        for (Currency i : Currency.values()) {
            if (amount == i.getValue()) {
                depositPool += amount;
                return;
            }
        }
        System.out.println("Not valid, please insert valid currency");
    }

    public int endSession(){
        int change = depositPool;
        depositPool = 0;
        return change;
    }

    public int getBalance(){

        return depositPool;
    }

    public String getDescription (int productNumber ){
        for (Product product : stockedProducts) {
            if (product.getProductNumber() == productNumber) {
                return product.examine();
            }
        }
        System.out.println("Product not found");
        return null;
    }

    public String[] getProducts(){
        String[] ProductArray = new String[9];
        for(int i = 0; i < stockedProducts.length; i++)

            ProductArray[i] = stockedProducts[i].getProductNumber() + "  " + stockedProducts[i].getName();

        return ProductArray;
    }


    public Product request(int productNumber) {
        for (Product product : stockedProducts) {
            if (product.getProductNumber() == productNumber) {
                return product;
            }
        }
        return null;
    }






}
