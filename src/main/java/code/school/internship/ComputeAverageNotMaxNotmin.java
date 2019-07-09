package code.school.internship;

public class ComputeAverageNotMaxNotmin {
    public static void main(String[] args) {
        double[] arr = {1, 1.2, 1.3, 1.4, 2, 2.5, 5, 8, 5.2, 26, 10};

        int countInt = 0, Sum = 0;
        int [] Array=new int[countInt-1];
        for (int k = 0; k < arr.length; k++)
            if (arr[k] % 1 == 0) {
                countInt += 1;
                Sum += arr[k];

                System.out.print(arr[k] + "  ");
                System.out.println(countInt);
                // @ndhanur gumaric hanel max u min bajanel (countInt-2) i vra, chem karum max u min hashvem????
            }

            for(int i=0;i<countInt-1;i++){
                System.out.println(Array[i]);
            }
    }
}