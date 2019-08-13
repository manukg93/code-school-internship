package code.school.internship.homework4.client;

import code.school.internship.homework4.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("a120", "a120",300);
        Account account2 = new Account("a122","a122",500);

        account1.debit(100);
        account2.credit(200);
        account2.transferTo(account1, 500);
        System.out.println(account2.getBalance());
        System.out.println(account1.getBalance());

    }
}
