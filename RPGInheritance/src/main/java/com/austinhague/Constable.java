package com.austinhague;

public class Constable extends Human {

    private String jurisdiction;

    private int strengthPts = 60;
    private int staminaPts = 60;
    private int speedPts = 20;
    private int attackPowerPts = 5;
    private String charType = "Constable";

    // --- Constructor
    public Constable(String name, String jurisdiction) {
        super(name);
        this.jurisdiction = jurisdiction;
    }

    // --- Behaviors (Yes i might've gone overboard on the attack method)
    public void attackCharacter(Human opponent) {
        if (opponent.getHealthPts() > 0) {
            System.out.println("Stick em up!!! " + this.name + " the " + this.getCharType() + " attacked " + opponent.name + " the " + opponent.getCharType() + ".");
            if (!opponent.getCharType().equals("Warrior") || opponent.getShieldStrengthPts() < 0) {
                System.out.println("-" + this.getStrengthPts() + " to " + opponent.name + "'s health.");
                int currentHealth = opponent.getHealthPts();
                int thisStrength = this.getStrengthPts();
                currentHealth -= thisStrength;
                opponent.setHealthPts(currentHealth);
            } else {
                System.out.println("CHINK " + opponent.name + " blocked the attack with his shield.");
                int attackShield = opponent.getShieldStrengthPts() - this.getAttackPowerPts();
                if (attackShield < 0) {
                    System.out.println("OH NO! " + opponent.name + "'s shield broke.");
                    System.out.println("- " + -attackShield + " to " + opponent.name + "'s health.");
                    int newHealth = opponent.getHealthPts() + attackShield;
                    opponent.setHealthPts(newHealth);
                } else {
                    System.out.println("The block was successful, -" + this.getAttackPowerPts() + " to " + opponent.name + "'s Shield.");
                    opponent.setShieldStrengthPts(attackShield);
                }
            }
            if (opponent.getHealthPts() < 0) {
                System.out.println(opponent.name + " has perished due to the wounds inflicted from the attack");
                System.out.println(this.name + " has been rounded up by the local constable and sentenced to 5 years in prison");
                opponent.setArrestedStatus(true);
                opponent.setJailTimeDays(5);
            }
        } else {
            System.out.println("You cannot attack a dead player.");
        }
    }

    public void arrestCharacter(Human jailBird, int sentenceLength) {
        System.out.println(this.name + " the " + this.getCharType() + " of jurisdiction " + this.getJurisdiction() + " has rounded up " + jailBird.name + " to arrest him.");
        System.out.println(jailBird.name + " has been sentenced to " + sentenceLength + " years in prison.");
        jailBird.setArrestedStatus(true);
        jailBird.setJailTimeDays(sentenceLength);
    }

    // --- Getters/Setters
    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public int getStrengthPts() {
        return strengthPts;
    }

    @Override
    public void setStrengthPts(int strengthPts) {
        this.strengthPts = strengthPts;
    }

    @Override
    public int getStaminaPts() {
        return staminaPts;
    }

    @Override
    public void setStaminaPts(int staminaPts) {
        this.staminaPts = staminaPts;
    }

    @Override
    public int getSpeedPts() {
        return speedPts;
    }

    @Override
    public void setSpeedPts(int speedPts) {
        this.speedPts = speedPts;
    }

    @Override
    public int getAttackPowerPts() {
        return attackPowerPts;
    }

    @Override
    public void setAttackPowerPts(int attackPowerPts) {
        this.attackPowerPts = attackPowerPts;
    }

    @Override
    public String getCharType() {
        return charType;
    }

    @Override
    public void setCharType(String charType) {
        this.charType = charType;
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                ", strengthPts=" + strengthPts +
                ", staminaPts=" + staminaPts +
                ", speedPts=" + speedPts +
                ", attackPowerPts=" + attackPowerPts +
                ", charType='" + charType + '\'' +
                ", name='" + name + '\'' +
                ", strengthPts=" + strengthPts +
                ", healthPts=" + healthPts +
                ", staminaPts=" + staminaPts +
                ", speedPts=" + speedPts +
                ", attackPowerPts=" + attackPowerPts +
                ", runningStatus=" + runningStatus +
                ", arrestedStatus=" + arrestedStatus +
                ", jailTimeDays=" + jailTimeDays +
                '}';
    }
}
