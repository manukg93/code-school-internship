package main.java.code.school.internship;

public class Lesson_2_July_02 {
    public static void main(String[] args) {
        int a = 4;
        int b=5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a * b = " + (a * b));

        System.out.println("b % a = " + (b % a));
        System.out.println("a + b = a+=b  = " + (a+=b));
        System.out.println("a = " + (a));
        System.out.println("a = a - b = a-=b  = " + (a-=b));
        System.out.println("a = " + (a));
        System.out.println("a = a * b = a*=b = " + (a*=b));
        System.out.println("a = " + (a));
        System.out.println("a = a / b = a/=b  = " + (a/=b));
        System.out.println("a = " + (a));
        System.out.println("(if a < b and type int then (a/=b) = a)");
        System.out.println("b = b % a = b%=a  = " + (b%=a));
        System.out.println("b = " + (b));

    }

}

class Ares {
    public static void main(String[] args) {
        int height = 15;
        int width = 25;
        System.out.println("Area of rectangle is " + (height * width));
    }
}

class OddEven {
    public static void main(String[] args) {
        int number = 27;
        if(number % 2 == 0) System.out.println("The number is even");
        if(number % 2 != 0) System.out.println("The number is odd");
    }
}

class Rand {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 10);
        System.out.println("Random " + number);
    }
}


class SwitchCase {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 10); // number [0-9]
        if(number == 0)number++; // number [1-9]
        switch (number)
        {
            case 1:
                System.out.println("Number = " + number);
                break;
            case 2:
                System.out.println("Number = " + number);
                break;
            case 3:
                System.out.println("Number = " + number);
                break;
            case 4:
                System.out.println("Number = " + number);
                break;
            case 5:
                System.out.println("Number = " + number);
                break;
            case 6:
                System.out.println("Number = " + number);
                break;
            case 7:
                System.out.println("Number = " + number);
                break;
            case 8:
                System.out.println("Number = " + number);
                break;
            default:
                System.out.println("Number = " + number);
        }

    }
}