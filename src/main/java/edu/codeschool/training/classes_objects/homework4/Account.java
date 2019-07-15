package edu.codeschool.training.classes_objects.homework4;

public class Account {
    private int id;
    private String name;
    private double balance;
    public Account(int id , String name){
        this.id=id;
        this.name=name;
    }
    public Account(){

    }
    public Account(int id,String name, double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public int getId() {return id; }

    public String getName() {return name; }

    public double getBalance() { return balance; }

   public double  credit( double amount){
        this.balance=amount+balance;
        return this.balance;
   }
   public double debit(double amount) {
       this.balance = balance - amount;
       return this.balance;
   }
   public double TransferTo(Account otherAccount, int amount) {
        this. balance=balance-amount;
        return this.balance;
   }

    @Override
    public String toString() {
        return "Account[" + "id=" + this.id + " , name="+ this.name+  " , balance=" + this.balance + "]";
    }
}
