package code.school.internship.arrays_and_loops;

public class Ex8Array3 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        int index = 5;

        if(index < 0 || index >= ints.length) {
            System.out.println("Index is out of range");
            return;
        }

        System.out.print("Array before: ");
        for(int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();

        for(int i = index; i < ints.length-1; i++) {
            ints[i] = ints[i+1];
        }
        ints[ints.length-1] = 0;

        System.out.print("Array after: ");
        for(int i = 0; i < ints.length - 1; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();

    }
}
