package edu.codeschool.training.classes_objects.homework6.client;

import edu.codeschool.training.classes_objects.homework6.exercise2.FireMonster;
import edu.codeschool.training.classes_objects.homework6.exercise2.StoneMonster;
import edu.codeschool.training.classes_objects.homework6.exercise2.WaterMonster;

public class MonsterChempionship {

//    FireMonster fire = new FireMonster();
//    WaterMonster water = new WaterMonster();
//    StoneMonster stone = new StoneMonster();
//    ???
    public static void main(String[] args) {
        FireMonster fire = new FireMonster();
        WaterMonster water = new WaterMonster();
        StoneMonster stone = new StoneMonster();
        System.out.println(fire.attack());
        System.out.println(water.attack());
        System.out.println(stone.attack());
    }

}
