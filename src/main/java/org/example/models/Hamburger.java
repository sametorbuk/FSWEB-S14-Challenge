package org.example.models;

public class Hamburger {

    private String name;
    private  String meat;
    private  String breadRollType;
    private  double price;


    public Hamburger(String name, String meat, double price ,  String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    private String addition5Name;
    private double addition5Price;

    public Hamburger() {
        this.price=13;
    }



    public void addHamburgerAddition1(String addition1Name , double addition1Price){
        this.addition1Name=addition1Name;
        this.addition1Price=addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name , double addition2Price){
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name , double addition3Price){
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name , double addition4Price){
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
    }



    public String itemizeHamburger(){
        return "Name : " + name + " " + "Meat:" + meat +
                "BreadRollType:" + breadRollType + "" + "Addition:1" + addition1Name
                + "Addition:2" + addition2Name +
                "Addition:3" + addition3Name +
                 "Price:" + " " + price;

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }
}
