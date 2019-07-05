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

class pyramid {
    public static void main(String[] args) {
        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 0 ; j < 6 - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0 ; k <= 2*i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Divides_3_and_7 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100);
        System.out.println("Number = " + num);
        boolean checker = false;
//        method 1
        if(num % 3 == 0 ){
            checker = true;
            System.out.println("(method 1) Number divides to 3");
        } else if(num % 7 == 0 ) {
            checker = true;
            System.out.println("Number divides to 7");
        }

//        method 2
        if(num % 3 == 0 ) {
            checker = true;
            System.out.println("(method 2) Number divides to 3");
            if (num % 7 == 0){
                System.out.println("and divides to 7");
            }
        }

//        method 3
        if(num % 3 == 0 && num % 7 == 0) {
            checker = true;
            System.out.println("(method 3) Number divides to 3 and 7");
        }

        if(!checker){
            System.out.println("Number not divides to 3 or 7");
        }
    }
}
class Divides_5_or_6 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100);
        System.out.println("Number = " + num);
        boolean checker = false;

//        method 1
        if(num % 5 == 0 ){
            checker = true;
            System.out.println("(method 1) Number divides to 5");
        } else if(num % 6 == 0 ) {
            checker = true;
            System.out.println("Number divides to 6");
        }

//        method 2
        if(num % 5 == 0 ) {
            checker = true;
            System.out.println("(method 2) Number divides to 5");
            if (num % 6 == 0){
                System.out.println("and divides to 6");
            }
        }

//        method 3
        if(num % 5 == 0 || num % 6 == 0) {
            checker = true;
            System.out.println("(method 3) Number divides to 5 or 6");
        }

        if(!checker){
            System.out.println("Number not divides to 5 and 6");
        }
    }
}

class MaxMin{
    public static void main(String[] args) {
        double n1 = 1.2, n2 = 0.6, n3 = -2.5, n4 = 0;

//        maximum
        if(
                n1 >= n2 &&
                n1 >= n3 &&
                n1 >= n4
        ){
            System.out.println("max n1 = " + n1);
        }else if(
                n2 > n1 &&
                n2 >= n3 &&
                n2 >= n4
        ) {
            System.out.println("max n2 = " + n2);
        }else if(
                n3 > n1 &&
                n3 > n2 &&
                n3 >= n4
        ) {
            System.out.println("max n3 = " + n3);
        }else{
            System.out.println("max n4 = " + n4);
        }

//        minimum
        if(
                n1 <= n2 &&
                n1 <= n3 &&
                n1 <= n4
        ){
            System.out.println("min n1 = " + n1);
        }else if(
                n2 < n1 &&
                n2 <= n3 &&
                n2 <= n4
        ) {
            System.out.println("min n2 = " + n2);
        }else if(
                n3 < n1 &&
                n3 < n2 &&
                n3 <= n4
        ) {
            System.out.println("min n3 = " + n3);
        }else{
            System.out.println("min n4 = " + n4);
        }
    }
}