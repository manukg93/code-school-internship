package code.school.internship;

public class ArrayValyu {
    //Given array = {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15}.

    public static void main(String[] args) {
    double [] Array= {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15};
    int arraylength= Array.length;
    double result=0;
    for (int i=0; i<10; i++){
        result= result+Array[i];
    }
        System.out.println(result/Array.length);

    }
}
