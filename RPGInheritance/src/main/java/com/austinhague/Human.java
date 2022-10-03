package com.austinhague;

public abstract class Human {

    public String name;
    private int strengthPts;
    protected int healthPts = 100;
    private int staminaPts;
    private int speedPts;
    private int attackPowerPts;
    protected boolean runningStatus = false;
    protected boolean arrestedStatus = false;
    protected int jailTimeDays = 0;
    private int shieldStrengthPts;
    public String charType;
    // --- Constructor
    public Human(String name) {
        this.name = name;
    }
    // --- Abstract Behavior (applied to all subclasses)
    abstract void attackCharacter(Human opponent);
    // --- Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrengthPts() {
        return strengthPts;
    }

    public void setStrengthPts(int strengthPts) {
        this.strengthPts = strengthPts;
    }

    public int getHealthPts() {
        return healthPts;
    }

    public void setHealthPts(int healthPts) {
        this.healthPts = healthPts;
    }

    public int getStaminaPts() {
        return staminaPts;
    }

    public void setStaminaPts(int staminaPts) {
        this.staminaPts = staminaPts;
    }

    public int getSpeedPts() {
        return speedPts;
    }

    public void setSpeedPts(int speedPts) {
        this.speedPts = speedPts;
    }

    public int getAttackPowerPts() {
        return attackPowerPts;
    }

    public void setAttackPowerPts(int attackPowerPts) {
        this.attackPowerPts = attackPowerPts;
    }

    public boolean isRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(boolean runningStatus) {
        this.runningStatus = runningStatus;
    }

    public boolean isArrestedStatus() {
        return arrestedStatus;
    }

    public void setArrestedStatus(boolean arrestedStatus) {
        this.arrestedStatus = arrestedStatus;
    }

    public int getJailTimeDays() {
        return jailTimeDays;
    }

    public void setJailTimeDays(int jailTimeDays) {
        this.jailTimeDays = jailTimeDays;
    }

    public int getShieldStrengthPts() {
        return shieldStrengthPts;
    }

    public void setShieldStrengthPts(int shieldStrengthPts) {
        this.shieldStrengthPts = shieldStrengthPts;
    }
    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", strengthPts=" + strengthPts +
                ", healthPts=" + healthPts +
                ", staminaPts=" + staminaPts +
                ", speedPts=" + speedPts +
                ", attackPowerPts=" + attackPowerPts +
                ", runningStatus=" + runningStatus +
                ", arrestedStatus=" + arrestedStatus +
                ", jailTimeDays=" + jailTimeDays +
                ", charType='" + charType + '\'' +
                '}';
    }
}
