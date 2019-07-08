package code.school.internship;

public class CommonElementsOffTwoArrays {
    public static void main(String[] args) {
        int [] Array1={1,2,3,4};
        int [] Array2={3,4,5,6};
        for(int i=0;i<Array1.length;i++){
            for (int k=0;k<Array2.length;k++){
                if(Array1[i]==Array2[k]){
                    System.out.println("The common elements of two Arrays is: " + Array1[i]);
                }



            }
        }
    }
}
