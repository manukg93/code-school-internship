package edu.codeschool.training.classes_objects.homework4.client;

public class TestAccount {
    public static void main(String[] args) {
      Account account = new Account(1, "Hello", 1000);
      Account account1 = new Account(2, "World", 1000);
      System.out.println("Information is " );
      account.debit(100);
      account1.credit(200);
      account1.transfer(account, 500);
        System.out.println(account.toString());
        System.out.println(account1.toString());
    }
}
