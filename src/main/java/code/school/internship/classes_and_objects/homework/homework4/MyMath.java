package code.school.internship.classes_and_objects.homework.homework4;

    public class MyMath {
        public int MinFunct(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public double DoubleMin(double[] array) {
            double min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public int MaxFunct(int[] array) {

            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < max) {
                    max = array[i];
                }
            }
            return max;
        }

        public double DoubleMax(double[] array) {

            double max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < max) {
                    max = array[i];
                }
            }
            return max;
        }

        public int SumOfInt(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }

        public double SumOfDouble(double[] array) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }

        public int MullOfInt(int[] array) {
            int sum = 1;
            for (int i = 0; i < array.length; i++) {
                sum *= array[i];
            }
            return sum;
        }

        public double MullOfInt(double[] array) {
            double sum = 1;
            for (int i = 0; i < array.length; i++) {
                sum *= array[i];
            }
            return sum;
        }

        public String IsPrime(int number) {
            boolean flag = false;
            for (int i = 2; i <= number / 2; ++i) {

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
    }

