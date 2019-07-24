package edu.codeschool.training.interfaces.homework6.client;

import edu.codeschool.training.interfaces.homework6.AbstractMonster;
import edu.codeschool.training.interfaces.homework6.FireMonster;
import edu.codeschool.training.interfaces.homework6.StoneMonster;
import edu.codeschool.training.interfaces.homework6.WaterMonster;

public class MonsterChempionship {
    public static void main(String[] args) {
        // Creating object of type FireMonster
        AbstractMonster abstractMonster = new FireMonster("Fire monster");
        System.out.println(abstractMonster.attack() + " attack!!!");

        // Creating object of type WaterMonster
        abstractMonster = new WaterMonster("Water monster");
        System.out.println(abstractMonster.attack() + " attack!!!");

        // Creating object of type StoneMonster
        abstractMonster = new StoneMonster("Stone monster");
        System.out.println(abstractMonster.attack() + " attack!!!");

    }
}
