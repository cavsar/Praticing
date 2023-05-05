package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ProductPrices {
    public static void main(String[] args) {
        /*
        Product         Price
        iPhone      ->  1000
        Macbook Pro ->  1300
        iMac        ->  1500
        Airpods     ->  200
        iPad        ->  700
        TASK 1:
        Find the most expensive product and print it as below
        Expected:
        iMac is the most expensive with the price of $1500.0
        TASK 2:
        Find the most affordable product and print it as below
        Expected:
        Airpods is the most affordable with the price of $200.0
         */

        HashMap<String, Double> products = new HashMap<>();
        products.put("iPhone", 1000.0);
        products.put("Macbook Pro", 1300.0);
        products.put("iMac", 1500.0);
        products.put("AirPods", 200.0);
        products.put("iPad", 700.0);

        double expensive = new TreeSet<>(products.values()).last();
        for(Map.Entry<String, Double> product : products.entrySet()){
            if (product.getValue() == expensive) {
                System.out.println(product.getKey() + " is the most expensive with the price of $" + product.getValue());
            }
        }

        double affordable = new TreeSet<>(products.values()).first();
        for(Map.Entry<String, Double> product : products.entrySet()){
            if(product.getValue() == affordable) {
                System.out.println(product.getKey() + " is the most affordable with the price of $" + product.getValue());
            }}}}



