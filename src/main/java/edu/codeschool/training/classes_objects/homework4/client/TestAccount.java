package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account=new Account(12345,"Hayko",1000);
        Account otherAccount=new Account(12346,"Hamo",2000);
        account.debit(100);
        otherAccount.credit(200);
        account.transferTo(otherAccount,500);
        otherAccount.getBalance();
        System.out.println(account);
        System.out.println(otherAccount);
    }
}
