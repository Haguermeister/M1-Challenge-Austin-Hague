package com.austinhague;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {
    public Warrior stephanie;
    public Constable dan;
    public CannabisCultivator austin;
    @Before
    public void setup(){
        stephanie = new Warrior("Stephanie");
        dan = new Constable("Dan","JavaLand");
        austin = new CannabisCultivator("Austin");
    }

    @Test
    public void shouldDecreaseHealthofAustinWhenAttackedByStephanie(){
        //Arrange
        int expectedHealth = 25;
        //Act
        stephanie.attackCharacter(austin);
        //Assert
        assertEquals(expectedHealth,austin.getHealthPts());
    }
    @Test
    public void farmerShouldAddHealth(){
        //Arrange
        int expectedHealth = 110;
        //Act
        austin.attackCharacter(stephanie);
        //Assert
        assertEquals(expectedHealth,stephanie.getHealthPts());
    }
    @Test
    public void shouldChangeArrestStatus(){
        //Arrange;
        boolean expectedJailStatus = true;
        //Act
        dan.arrestCharacter(austin,5);
        //Assert
        assertEquals(expectedJailStatus,austin.isArrestedStatus());
    }
    @Test
    public void shouldLowerShieldHealth(){
        //Arrange
        int expectedShieldHealth = 95;
        //Act
        dan.attackCharacter(stephanie); //How dare he
        //Assert
        assertEquals(expectedShieldHealth,stephanie.getShieldStrengthPts());
    }
    @Test
    public void ifShieldIsLessThanAttackLowerHealth(){
        //Arrange
        int expectedHealth = 95;
        dan.setAttackPowerPts(105); // Wow dan is so strong
        //Act
        dan.attackCharacter(stephanie); //How dare he
        dan.setAttackPowerPts(5); // jk not anymore
        //Assert
        assertEquals(expectedHealth,stephanie.getHealthPts());
    }
// I could do more tests but I'm tired.
}