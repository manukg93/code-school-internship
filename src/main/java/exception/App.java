package exception;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Vardan");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {
            person.setAge(age);
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(person.getAge());
    }
}
