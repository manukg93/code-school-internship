package homework16;

public class Math<T extends Comparable> {
    public static <T extends Comparable> T max(T[] array) {
        T max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static <T extends Comparable> T min(T[] array) {
        T min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public static <T extends Comparable> T[] bubble(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    T temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }


            }
        }
        return array;
    }

    public static <T extends Comparable> T[] reverse(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            T temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static <T extends Comparable> boolean searchEl(T[] array, T var) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(var) == 0){
                return true;
            }
        }
        return false;
    }

}
