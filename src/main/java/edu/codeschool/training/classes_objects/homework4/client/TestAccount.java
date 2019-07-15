package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Account;


public class TestAccount {
    public static void main(String[] args) {
        Account a1=new Account(222, "Hamo", 2000);
        Account a2=new Account(444,"Hayko",1000);
        a1.TransferTo(a2,500);
        a1.debit(100);
        a2.credit(200);
        System.out.println(a1);
        System.out.println(a2);
        
    }
}
