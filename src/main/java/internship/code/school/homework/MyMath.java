package internship.code.school.homework;

public class MyMath {
    public int minFunct(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public double doubleMin(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int maxFunct(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        return max;
    }

    public double doubleMax(double[] array) {

        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        return max;
    }

    public int sumOfInt(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double sumOfDouble(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int mullOfInt(int[] array) {
        int sum = 1;
        for (int i = 0; i < array.length; i++) {
            sum *= array[i];
        }
        return sum;
    }

    public double mullOfDouble(double[] array) {
        double sum = 1;
        for (int i = 0; i < array.length; i++) {
            sum *= array[i];
        }
        return sum;
    }
    public static String isPrime(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return "The number is prime";
        else
            return "The number is not prime";

    }
    public static double powFunct(int m,int n){
        return Math.pow(m,n);
    }


}
