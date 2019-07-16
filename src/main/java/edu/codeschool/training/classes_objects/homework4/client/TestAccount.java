package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("First", "AAA", 1967);
        Account account2 = new Account("Second", "BBB", 2378.999);

        account1.debit(100);
        account2.credit(200);
        account1.transferTo(account2, 500);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

    }
}
