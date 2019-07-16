package edu.codeschool.training.classes_objects.homework4;

public class Account {
    private String id;
    private String name;
    private double balance;
    public Account(){
    };
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double amount){
        return this.balance += amount;
    }

    public double debit(double amount){
        return this.balance -= amount;
    }

    public void transferTo(Account otherAccount, int amount){
//        ?
        this.balance -= amount;
    }

    public String toString(){
        return "Account[id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]";
    }
}
