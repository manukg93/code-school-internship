package code.school.internship;

public class PrintTriangle {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i += 2){
            for (int j = 1; j <= i; j++){
              System.out.print("*");
            }
            System.out.println();
        }
    }
}

