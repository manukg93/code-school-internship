package code.school.internship;

public class IfArrayContainsN {
    public static void main(String[] args) {
        //{1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32} и n = 19
        int [] Array= {1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32};
        int n=19;
        int arraylength=Array.length;
        if(arraylength>=n){
            System.out.println(Array[n-1]);
        }else{
            System.out.println("This Array length is small than 'n'");
        }
    }
}
