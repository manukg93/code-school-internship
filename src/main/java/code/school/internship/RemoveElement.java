package code.school.internship;

public class RemoveElement {
    //array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49} remove the element. index=4
    public static void main(String[] args) {
        int Array[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int n=4;
        for (int i = 0; i < Array.length; i++) {
            if(i<n || i>n){
                System.out.println(Array[i]);
            }


        }

    }

}
