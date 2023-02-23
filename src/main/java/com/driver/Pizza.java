package com.driver;

public class Pizza {

    private int price;
    private int toppings;
    private Boolean isVeg;
    private String bill;
private boolean isExtraToppingAdded;
private boolean isExtraCheeseAdded;
private boolean isTakeAway;
private boolean isBillCreated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price =300;
            this.toppings = 70;
            this.bill = "Base Price Of The Pizza: "+this.price + "\n";
        }
        else{
        this.price = 400;
        this.toppings = 120;
            this.bill = "Base Price Of The Pizza: "+this.price + "\n";
    }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price += 80;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded){
            this.price += this.toppings;
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";}
                if (isExtraToppingAdded) {
                    this.bill += "Extra Toppings Added: " + this.toppings + "\n";
                }
                if (isTakeAway) {
                    this.bill += "Paperbag Added: 20"+ "\n";
                }
                this.bill += "Total Price: " + this.price + "\n";


        }
        isBillCreated =true;
        return this.bill;
    }
}
