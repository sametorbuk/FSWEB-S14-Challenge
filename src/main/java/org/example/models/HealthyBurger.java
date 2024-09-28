package org.example.models;

public class HealthyBurger extends Hamburger {



    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    private String healthyExtra3Name;
    private double healthyExtra3Price;

    private String healthyExtra4Name;
    private double healthyExtra4Price;

   public HealthyBurger(){
       setPrice(getPrice() + healthyExtra1Price + healthyExtra2Price);
   }

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }


    public void addHealthyAddition1(String ingredient , double price){
        this.healthyExtra1Name=ingredient;
        this.healthyExtra1Price=price;
    }

    public void addHealthyAddition2(String ingredient , double price){

        this.healthyExtra2Name=ingredient;
        this.healthyExtra2Price=price;
    }


    @Override
    public String itemizeHamburger() {
        double price = getPrice() + healthyExtra1Price + healthyExtra2Price;
        return "Name : " + getName() + " " + "Meat:" + getMeat() +
                "BreadRollType:" + getBreadRollType() + " " + "Addition:1" + healthyExtra1Name
                + "Addition:2" + healthyExtra2Name +

                "Price:" + " " + getPrice();
    }
}
