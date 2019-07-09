package code.school.internship;

public class RemoveTheElement {
    public static void main(String[] args) {
        int [] Array= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int arraylength=Array.length;
        int n=4;
        if(arraylength>n) {
            for (int i = 0; i < arraylength; i++) {
                System.out.println(Array[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(Array[i]+" ");
            }
            for (int i = n + 1; i < arraylength; i++) {
                System.out.print(Array[i]+" ");
            }
        }
        }

}