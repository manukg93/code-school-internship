package edu.codeschool.training.exceptions.homework11.quiz;

public class Question_8 {

    int count = 0;

    void A() throws Exception {

        try {
            count++;

            try {
                count++;

                try {
                    count++;
                    throw new Exception();
                }
                catch (Exception ex) {
                    count++;
                    throw new Exception();
                }
            }
            catch (Exception ex) {
                count++;
            }
        }
        catch (Exception ex) {
            count++;
        }
    }

    void display() {
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception {
        Question_8 object = new Question_8();
        object.A();
        object.display();
    }
}
