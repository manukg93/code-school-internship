package homework.six.exercise2;

public class MonsterChampionship {
    public static void main(String[] args) {
        FireMonster fireMonster = new FireMonster();
        WaterMonster waterMonster = new WaterMonster();
        StoneMonster stoneMonster = new StoneMonster();
        System.out.println(fireMonster.attack());
        System.out.println(stoneMonster.attack());
        System.out.println(waterMonster.attack());
    }
}
