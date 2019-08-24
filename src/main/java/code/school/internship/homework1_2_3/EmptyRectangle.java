package code.school.internship.homework1_2_3;

public class EmptyRectangle {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <4; j++) {
                if(i==0||i==4){
                    System.out.print("*"+" ");

                }else if(j==1||j==2){
                    System.out.print("*"+"     ");
                }

            }
            System.out.println();
        }



    }

}