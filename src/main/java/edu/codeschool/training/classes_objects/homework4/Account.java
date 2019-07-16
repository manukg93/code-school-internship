package edu.codeschool.training.classes_objects.homework4;

public class Account {
    private String id;
    private String name;
    private double balance;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return  name;
    }

    public double getBalance() {
        return balance;
    }

    // Public methods
    public double credit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double debit(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public void transferTo(Account otherAccount, double amount) {
        otherAccount.credit(amount);
        this.debit(amount);
    }

    public String toString() {
        String stringRepresentation = "Account[id = " + id + ", name = " + name + ", balance = " + balance + "]";
        return stringRepresentation;
    }
}
