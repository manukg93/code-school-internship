package Homework6;
public class MonstersChempionship {
    public static void main(String[] args) {
        FireMonster a = new FireMonster();
        WatherMonster b = new WatherMonster();
        StoneMonster c = new StoneMonster();
        System.out.println(a.attack());
        System.out.println(b.attack());
        System.out.println(c.attack());
    }
}
