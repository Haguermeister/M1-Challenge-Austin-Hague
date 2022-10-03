package com.austinhague;

public class Application {
    public static void main(String[] args) {
        Address shipping = new Address("123 Street", "", "Annapolis", "Maryland", "21401");
        Address billing = new Address("123 Street", "", "Annapolis", "Maryland", "21401");
        Customer austin = new Customer("Austin", "Hague", "email@gmail.com", "123-456-7890",true, shipping, billing);

        System.out.println(austin);
    }
}
