package code.school.internship.homework4;

public class MyMath {
    public static final double a = 3.14;

 public int min(int [] arr){
     System.out.println("min int value is" + arr[0] );
    return arr [0];
 }
 public double min(double [] arr){
     System.out.println("min double value is" + arr[0]);
     return arr [0];
 }
 public int max(int [] arr){
     System.out.println("max int value is" + arr[arr.length-1]);
     return  arr [arr.length-1];
 }
 public double max(double [] arr){
     System.out.println("max double value is" + arr[arr.length-1]);
     return arr[arr.length-1];
 }
 public int sum(int [] arr){
     int sum = 0;
     for (int x:arr) {
         sum = sum + x;
     }
     System.out.println(sum);
     return sum;

 }
 public double sum(double [] arr){
     double sum = 0;
     for (double x:arr) {
         sum += x;
     }
     System.out.println(sum);
     return sum;
 }
 public int mull(int [] arr) {
     int mull = arr[0];
     for (int x : arr) {
         mull = mull * x;
     }
     System.out.println(mull);
     return mull;
 }
  public double mull(double [] arr){
     double mull = arr[0];
     for(double x:arr){
         mull = mull*x;
     }
      System.out.println(mull);
     return mull;
 }
}