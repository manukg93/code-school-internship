package main.java.code.school.internship;

public class Lesson3 {
    public static void main(String[] args) {
        int number = 1000000;
        int sum = 0;
        for(int i = 1; i <= number; i+=2){
            sum+=i;
        }

        System.out.println(sum);
    }
}

class Ex2{
    public static void main(String[] args) {
        int Number = 25;
        System.out.println(Long.MAX_VALUE);
        long res = 1;
        for(int i = 1; i <= Number; i++){
            res*=i;
        }
        System.out.println(res);
    }
}

class Ex3 {
    public static void main(String[] args) {
        int n = 2;
        int m = 9;
        int num = 1;
        for (int i=1; i<=n; i++){
            num*=m;
        }
        System.out.println(num);
    }
}

class Ex4 {
    public static void main(String[] args) {
        int n = 1895627;
        boolean b = false;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                b = true;
                break;
            }
        }
        if (!b){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
}

class Ex5 {
    public static void main(String[] args) {
        int num = 10000;
        double result = 0.0;
        while(num > 0){
            result+=(double) 1 / num;
            num--;
        }
        System.out.println(result);
    }
}

class Ex6 {
    public static void main(String[] args) {
        double array[] = {1.2, 2.2, 5.5, 4.5, 5, 7.8, 8.5, 7, 5.1, 3.15};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum/array.length);
    }
}

class Ex7 {
    public static void main(String[] args) {
        int array[] = {1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32};
        int num = 33;
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num){
                b=true;
                System.out.println(i);
            }
        }
        if (!b){
            System.out.println("The array does not contain the value");
        }
    }
}

class Ex8 {

}