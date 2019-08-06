package Homework8;
public class CustomStirngCreation {
    public static void main(String[] args) {
       char[] characters = {21, 89, 3, 15, 888, 10, 9, 100};
       CustomString a = new CustomString(characters);
       System.out.println(a.charAt(5));
    }
}
