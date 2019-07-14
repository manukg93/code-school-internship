package Day_09_07_19;

public class HomworkSeven {
    public static void main(String[] args) {
        final int[] array = new int[]{1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32};
        int n = 100;
        for ( int x = 0; x < array.length; x++) {
            if (array[x] != n) {
                System.out.println("The index is " + (n));
                break;
            }
        }
            System.out.println("The array doesn't contain " + (n));
        }
    }
// can't resolve it  ;