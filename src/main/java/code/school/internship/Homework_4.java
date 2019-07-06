package code.school.internship;

public class Homework_4 {
    public static void main(String[] args) {
        int a = 7;
       switch (a) {
           case 0:
               System.out.println("Value is 0");
               break;
           case 1:
               System.out.println("value is 1");
               break;
           case 2:
               System.out.println("value is 2");
               break;
           case 3:
               System.out.println("value is 3");
               break;
           case 4:
               System.out.println("Value is 4");
               break;
           case 5:
               System.out.println("Value is 5");
               break;
           case 6:
               System.out.println("Value is 6");
               break;
           case 7:
               System.out.println("Value is 7");
               break;
           case 8:
               System.out.println("Value is 8");
               break;
           case 9:
               System.out.println("Value is 9");
               break;
       }
               // I think we can also write the given number by excluding it
        {
           int b = 7;
           // the given number is 7
           int c = 38;
           // c represent the summary of the 1-9 interval without the value 7
           int d = 9 * (9+1) / 2;
           // d represent the real summary of the 1-9 interval
           int e = d - c;
           // e represent the value which was excluded from the interval
           if (e==b)
               System.out.println("Value is " + (b));
           // Sorry I don't understand well how to use for/while for this code
       }
    }
}
