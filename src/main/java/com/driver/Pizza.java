package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;
    private boolean billCreated;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price = 300;
        else this.price = 400;

        this.bill = "";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) this.price += 80;

        extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings){
            if (isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
        }

        extraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            this.price += 20;
        }

        takeAway = true;
    }

    public String getBill(){
        // your code goes here

        if(isVeg) this.bill += "Base Price Of The Pizza: " + 300 + "\n";
        else this.bill += "Base Price Of The Pizza: " + 400 + "\n";

        if(extraCheese) this.bill += "Extra Cheese Added: " + 80 + "\n";

        if(extraToppings) {
            if(isVeg) this.bill += "Extra Toppings Added: " + 70 + "\n";
            else this.bill += "Extra Toppings Added: " + 120 + "\n";
        }

        if(takeAway) this.bill += "Paperbag Added: " + 20 + "\n";

        if(billCreated) return "";
        else this.bill += "Total Price: " + this.price + "\n";

        this.billCreated = true;

        return this.bill;
    }
}
