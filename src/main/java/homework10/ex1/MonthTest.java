package homework10.ex1;


public class MonthTest {
    public static void main(String[] args) {
        int a = Month.JANUARY.ordinal() + 1;
        for (Month month : Month.values()) {
            System.out.println(a + " " + month + " " + month.getDaysCount());
            a++;
        }

    }
}
