package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super.setPrice(19.1);
        this.cips = "CURVY";
        this.drink = "COKE";

    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }
    

    public DeluxeBurger(String name, String meat,  String breadRollType) {
        super(name, meat, 0.0, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Burger için yeni malzeme eklenemez.");
    }



    @Override
    public String itemizeHamburger() {
        double price = getPrice();
        return "Name: " + getName() + " Meat: " + getMeat() + " BreadRollType: " + getBreadRollType() + " Price: " + price;
    }



}
