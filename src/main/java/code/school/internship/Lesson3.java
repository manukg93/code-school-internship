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
    public static void main(String[] args) {
        int array[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int num = 44;
        for(int i = 0; i < array.length; i++) {
            if(i > 4)
                array[i-1] = array[i];
        }
        array[array.length-1] = 0;
        for (int j = 0; j < array.length; j++)
            System.out.println(array[j]);

    }
}


class Exercise9 {
    public static void main(String[] args) {
        int array1[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int array2[] = new int[array1.length];
        for (int i=0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++)
            System.out.println(array2[j]);

    }
}

class Exercise10 {
    public static void main(String[] args) {
        int array[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int temp;
        int i = 1;
        int k = 0;
        while (i < array.length){
            if(array[1] < array[0]) {
               temp = array[i];
               array[i] = array[i-1];
               array[i-1] = temp;
               k++;
            }

            if(array[i] < array[i-1]){
                temp = array[i];
                array[i] = array[i -1];
                array[i -1] = temp;
                i--;
                k++;

            } else {
                i++;
            }
        }

        for (int j = 0; j < array.length; j++)
            System.out.println(array[j]);
            System.out.println("step "+k);
            System.out.println("min = "+array[0]);
            System.out.println("max = "+array[array.length-1]);

    }
}


class Exercise11 {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6};
        int array2[] = new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array2[i] = array1[array1.length-1-i];
        }
        for (int j = 0; j < array2.length; j++)
            System.out.println(array2[j]);
    }
}

class Exercise12 {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 5, 6, 6, 7, 2};
        for (int i=0;i<array.length;i++){
            if(i != array.length-1){
                if(array[i] == array[i+1]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}

class Exercise13 {
    public static void main(String[] args) {
        char array[] = {'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H'};
        int max = 90;
        int min = 65;
        int count = 0;
        for (int i=0; i<array.length; i++){
            if(array[i] >= min && array[i] <= max)count++;
        }
        System.out.println(count);
    }
}

class Exercise14 {
    public static void main(String[] args) {
        int firstNum = 13;
        int secondNum = 50;
        while (firstNum <= secondNum){
            if(firstNum % 2 != 0) {
                System.out.println("odd "+firstNum);
            }else {
                System.out.println("even "+firstNum);
            }
            firstNum++;
        }
    }
}

class Exercise15 {
    public static void main(String[] args) {
        int max = 100;
        for (int min=10; min<=max; min++){
            if(min % 3 == 0 && min % 7 != 0){
                System.out.println(min);
            }
        }

    }
}

class Exercise16 {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4};
        int array2[] = {3,4,5,6};
        for(int i=0; i<array1.length; i++){
            for(int j=0; j <array2.length; j++){
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}


class Exercise17 {
    public static void main(String[] args) {
        int array[] = {4,5,7,8,3};
        int temp;
        int i = 1;
        int k = 0;
        while (i < array.length){
            if(array[1] < array[0]) {
                temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                k++;
            }

            if(array[i] < array[i-1]){
                temp = array[i];
                array[i] = array[i -1];
                array[i -1] = temp;
                i--;
                k++;

            } else {
                i++;
            }
        }

        for (int j = 0; j < array.length; j++)
            System.out.println(array[j]);
        System.out.println(array[array.length-2] + " is second largest element");
        System.out.println(array[1] + " is second smallest element");
    }
}

class Exercise18 {
    public static void main(String[] args) {
        boolean array[] = {true, false, false, false, true, false};
        int sumTrue = 0;
        int sumFalse = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]){
                sumTrue++;
            }else{
                sumFalse++;
            }
        }
        System.out.println(sumTrue + " true");
        System.out.println(sumFalse + " false");
    }
}

class Exercise19 {
    public static void main(String[] args) {
        int array1[] = {1,2};
        int array2[] = {2,3,4};

        if (array1.length != array2.length) {
            System.out.println("not equal");
            return;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]){
                    System.out.println("not equal");
                    return;
                }

            }
        }
        System.out.println("equal");

    }
}

class Exercise20 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,6,7,8,9};
        for (int i=0; i<=array[array.length-1]; i++){
            if(array[i] != i+1){
                System.out.println(i+1+" is missing");
                break;
            }
        }
    }
}

class Exercise21 {
    public static void main(String[] args) {
        int array[] = {4,5,7,8,3};
        int sum  = array[0];
        int max = array[0];
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max)
                max = array[i];
            if(array[i]<min)
                min = array[i];

            sum+=array[i];
        }
//        System.out.println(sum);
        sum-=max;
        sum-=min;
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(sum);
//        System.out.println(array.length-2);
        System.out.println((double) sum/(array.length-2));
    }
}
class Exercise22 {
    public static void main(String[] args) {
        long array[] = {1, 16, 34, 149, 17};
        long num = 149;
        for(int i=0;i<array.length;i++){
            if(array[i] == num){
                System.out.println(num);
                break;
            }
        }
    }
}

class Exercise23 {
    public static void main(String[] args) {
        char character = 97;
        while (character < 123){
            System.out.println(character);
            character++;
        }
    }
}

class Exercise24 {
    public static void main(String[] args) {
        int count = 0;
        int number = 1546987;
        while(number != 0)
        {
            number = number/10;
            ++count;
        }
        System.out.println("The number of digits is " + count);
    }
}

class Exercise25 {
    public static void main(String[] args) {
        int remainder = 0;
        int sum = 0;
        int temp = 0;
        int number=456654;
        temp=number;
        while(number != 0){
            remainder = number%10;
            sum = (sum*10) + remainder;
            number = number/10;
        }
        if(temp == sum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}

class Exercise26 {
    public static void main(String[] args) {
        boolean b = false;

        for (int i = 1; i<1000; i++){
            b = false;
            for(int j = 2; j < i/2; j++){
                if(i % j == 0){
                    b = true;
                    break;
                }
            }
            if(!b){
                System.out.println(i);
            }
        }
    }
}