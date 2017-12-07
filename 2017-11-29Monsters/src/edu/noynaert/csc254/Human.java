package edu.noynaert.csc254;

public class Human extends Entity implements Mobile, Comparable<Human>{
    String symbol;
    String pronoun;
    String weapon;
    double strength;
    //double health;

    public Human(){
        super();
        boolean isMale = (Math.random() < 0.50);
        symbol = (isMale) ? "\uD83D\uDC68" : "\uD83D\uDC69 ";
        pronoun = (isMale) ? "his" : "her";
        strength = 1.0;
        health = 1.0;
        double weaponNumber = Math.random();
        if(weaponNumber < 0.40)
            weapon = "sword";
        else if(weaponNumber < 0.80)
            weapon = "axe";
        else {
            weapon = "stick";
            strength = 0.5;
        }
    }
    public Human(Human h){
        super(h);
        this.symbol = h.symbol;
        this.pronoun = h.pronoun;
        this.weapon =  h.getWeapon();
        this.strength = h.strength;


    }




    public String getPronoun() {
        return pronoun;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public double getStrength() {
        return strength;
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public double getAggressiveness() {
        return aggressiveness;
    }

    double aggressiveness = 0.80;



    @Override
    public String getSymbol(){
        return symbol;
    }

    @Override
    public int getRange() {
        return 3;
    }

    @Override
    public int compareTo(Human o) {
        return this.id - o.id;
    }
}
