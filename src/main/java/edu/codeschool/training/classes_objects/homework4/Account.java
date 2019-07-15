package edu.codeschool.training.classes_objects.homework4;

public class Account {
    private int id;
    private String name;
    private double balance;


    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public double credit(double amount){
        return balance+=amount;
    }
    public double debit(double amount){

        return balance-=amount;
    }


    public void transferTo(Account otherAccount,int amount){
            balance-=amount;
            otherAccount.balance+=amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
