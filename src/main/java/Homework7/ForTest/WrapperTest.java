package Homework7.ForTest;
import Homework7.WrapperFour;
import Homework7.WrapperMek;
import Homework7.WrapperThree;
import Homework7.WrapperTwo;

public class WrapperTest {
    public static void main(String[] args) {
        WrapperMek a = new WrapperMek();
        System.out.println("The value is " + a.value(7,6,15));
        System.out.println("The multiple value is " + a.multiple(4,3,5));
        System.out.println("The total number is " + a.total((a.value(7,6,15)), (a.multiple(4,3,5))));
        WrapperTwo b = new WrapperTwo();
        System.out.println("The raidus of the given cirle is " + b.Circle(17,13.4));
        WrapperThree c = new WrapperThree();
        System.out.println(c.concat("Hello ", " World"));
        WrapperFour d = new WrapperFour();
        System.out.println(d.even(8, 11, 24));
    }
}
