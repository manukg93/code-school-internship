package code.school.internship;

public class ArrayDividesTreeAndSeven {
    public static void main(String[] args) {
        int n1 = 10, n2 = 100;
        int[] Array = new int[n2 + 1];
        for (int i = 1; i < Array.length; i ++) {
            if (i >= n1 && i <= n2) {
                Array[i] = i;
                if(i%3==0 && i%7!=0){
                    System.out.println(i);
                }

            }
        }
    }
}