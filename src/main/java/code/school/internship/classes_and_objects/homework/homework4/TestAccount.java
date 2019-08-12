package code.school.internship.classes_and_objects.homework.homework4;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(2,"Josh",1000);
        Account otherAccount = new Account(3,"Ann",1500);
        account.debit(100);
        otherAccount.credit(200);
        account.transferTo(otherAccount,500);
        System.out.println(account.toString());
        System.out.println(otherAccount.toString());

    }
}