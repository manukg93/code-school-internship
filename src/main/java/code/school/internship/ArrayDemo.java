package code.school.internship;

public class ArrayDemo {
    public static void main(String [] xxx) {
        double [] arr = {1.0,2.6,0.2};

        double min = arr[0];

        for (int i = 0; i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Min is " + min);
    }
}
