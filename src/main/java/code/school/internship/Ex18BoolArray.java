package code.school.internship;

public class Ex18BoolArray {
    public static void main(String[] args) {
        boolean[] trueFalse = {true, true, false, true, false};
        int trueCount = 0;
        int falseCount = 0;

        for (int i = 0; i < trueFalse.length; i++) {
            if (trueFalse[i] == true) {
                trueCount++;
            } else {
                falseCount++;
            }
        }

        System.out.println("True: " + trueCount);
        System.out.println("False: " + falseCount);
    }
}
