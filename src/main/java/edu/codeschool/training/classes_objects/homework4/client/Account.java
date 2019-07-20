package edu.codeschool.training.classes_objects.homework4.client;

public class Account {
    private int id;
    private String name;
    private double balance;
    Account(int id, String name){
        this.id = id;
        this.name = name;
    }
    Account(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getid(){return id; }
    public String getname(){return name; }
    public double getbalance() {return balance; }
    public double credit(double GivenAmount) {
        return this.balance += GivenAmount;
    }
    public double debit(double GivenAmount){
        return this.balance -= GivenAmount;
    }
    public void transfer(Account otherAccount, int amount){
        this.balance -= amount;
        otherAccount.balance+=amount;
    }
    public String toString() {
        return "id = " + id + ", " + "name = " + name + ", " + "balance = " + balance;
    }
}
