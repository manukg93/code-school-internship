package code.school.internship.arrays_and_loops;

// Ex.22
public class LongArray {
    public static void main(String[] args) {
        final long VALUE = 111_111_111L;
        long[] array = {123_234L, 345_675L, 1_000_005L, 2_667_445L, 111_111_111L};

        for (int i = 0; i < array.length; i++) {
            if (VALUE == array[i]) {
                System.out.println(VALUE + " is found");
                break;
            }
        }
    }
}
