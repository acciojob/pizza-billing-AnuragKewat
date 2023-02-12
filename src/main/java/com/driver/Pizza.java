package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;
    private boolean billCreated;
    private int toppings;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            this.price += 80;
            this.extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings) {
            this.price += this.toppings;
            this.extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            this.price += 20;
            this.takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!billCreated) {
            if (extraCheese) this.bill += "Extra Cheese Added: " + 80 + "\n";

            if (extraToppings) this.bill += "Extra Toppings Added: " + this.toppings + "\n";

            if (takeAway) this.bill += "Paperbag Added: " + 20 + "\n";

            this.bill += "Total Price: " + this.price + "\n";

            this.billCreated = true;

            return this.bill;
        }

        return "";
    }
}
