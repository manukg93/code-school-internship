package edu.codeschool.training.classes_objects.homework6.exercise2;

public class MonsterChempionship {
    public static void main(String[] args) {
        AbstractMonster fireMonster=new FireMonster("Monster 1");
        AbstractMonster waterMonster=new WaterMonster("Monster 2");
        AbstractMonster stoneMonster=new StoneMonster("Monster 3");
        System.out.print(fireMonster.getName()+" - ");
        System.out.println(fireMonster.attack());
        System.out.print(waterMonster.getName()+" - ");
        System.out.println(waterMonster.attack());
        System.out.print(stoneMonster.getName()+" - ");
        System.out.println(stoneMonster.attack());
    }
}
