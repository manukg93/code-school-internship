package code.school.internship;

public class ArrayAverageValue {
    public static void main(String[] args) {
        //{1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15}.
        double [] Array={1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15};
        int arrayLength = Array.length;
        double Result=0;
        for(int i=0;i<10;i++){
            Result=Result+Array[i];
        }
        System.out.println(Result/arrayLength);
    }
}
