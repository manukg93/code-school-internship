package code.school.internship.homework4;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name){

    }

    public Account(String id, String name, double balance){
        this.balance = balance;
        this.id = id;
        this.name = name;

    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double credit(double amount){
        this.balance += amount;
        return this.balance;

    }

    public double debit(double amount){
        this.balance -= amount;
        return this.balance;
    }

    public void transferTo(Account otherAccount, int amount){

        otherAccount.balance += amount;
        this.balance -= amount;

    }



    public String toString(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        return "id" + " " + "name" + " " + "balance";


    }
}
