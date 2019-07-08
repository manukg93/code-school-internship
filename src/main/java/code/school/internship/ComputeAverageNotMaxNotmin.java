package code.school.internship;

public class ComputeAverageNotMaxNotmin {
    public static void main(String[] args) {
        double [] arr={ 1 , 1.2 , 1.3 , 1.4 , 2 , 2.5 , 5 , 8, 5.2, 26 , 10};
        int countInt=0, Sum=0;
        for (int i=0; i<arr.length; i++)
            if(arr[i]%1==0){
                countInt+=1;
                Sum+=arr[i];

                System.out.print(arr[i]+"  ");
                System.out.println(countInt);
                // @ndhanur gumaric hanel max u min bajanel (countInt-2) i vra, chem karum max u min hashvem????

            }

    }

}
