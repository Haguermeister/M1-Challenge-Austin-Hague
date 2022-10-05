package com.austinhague;

public class CannabisCultivator extends Human {

    private boolean plowingStatus = false;
    private boolean harvestingStatus = false;
    private int strengthPts = 75;
    private int staminaPts = 75;
    private int speedPts = 10;
    private int attackPowerPts =1;
    private String charType = "Medicinal Farmer";
    // --- Constructor
    public CannabisCultivator(String name) {
        super(name);
    }
    // --- Behaviors
    public void attackCharacter(Human opponent){
        System.out.println("Hey man make love, not war!" + this.name + " the " + this.getCharType() + " thought about attacking " + opponent.name + " the " + opponent.getCharType() +" but instead decided to spread the love and give " + opponent.name + " a joint.");
        System.out.println("+10 to " + opponent.name + "'s health.");
        int currentHealth = opponent.getHealthPts();
        currentHealth+=10;
        opponent.setHealthPts(currentHealth);
    }
    // --- Getters/Setters
    public boolean isPlowingStatus() {
        return plowingStatus;
    }

    public void setPlowingStatus(boolean plowingStatus) {
        this.plowingStatus = plowingStatus;
    }

    public boolean isHarvestingStatus() {
        return harvestingStatus;
    }

    public void setHarvestingStatus(boolean harvestingStatus) {
        this.harvestingStatus = harvestingStatus;
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
        return "CannabisCultivator{" +
                "plowingStatus=" + plowingStatus +
                ", harvestingStatus=" + harvestingStatus +
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
