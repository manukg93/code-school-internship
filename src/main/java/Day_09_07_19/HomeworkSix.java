package Day_09_07_19;

public class HomeworkSix {
    //Given array = {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15}.
    //Write a Java program to calculate the average value of array elements.
    public static void main (String[] args) {
        double[] array = new double[]{1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15};
        double sum = 0;
        int i = 0;
        for(i=0; i < array.length ; i++)
            sum = sum + array[i];
            double average = sum / array.length;
            System.out.println("Average value is : " + average);
    }
}

