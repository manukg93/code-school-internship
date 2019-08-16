package edu.codeschool.training.exceptions.homework12;

public class Test7 extends Exception {

    public Test7() {}

    public Test7(String str) {
        super(str);
    }

    int importantData = 12;

    public static void main(String[] args) {

        Test7 t = new Test7();

        try {
            t.importantMethod();
        } catch (Exception e) {
            System.out.println("Test7 Exception");
        }
    }

    private void importantMethod() throws Exception{
        if (this.importantData > 5) {
            throw new Test7("Improtant data is invalid");
        } else {
            System.out.println(this.importantData);
        }
    }


}
