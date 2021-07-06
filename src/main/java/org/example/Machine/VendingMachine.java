package org.example.Machine;

import org.example.model.Product;

public interface VendingMachine {

    public void addCurrency(int currency);

    public int endSession();

    public int getBalance();

    public String getDescription (int productNumber);

    public String[] getProducts();

    public Product request(int productNumber);



}
