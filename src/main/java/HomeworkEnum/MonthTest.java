package HomeworkEnum;

public class MonthTest {
    public static void main(String[] args) {
        for (Month element : Month.values()) {
            System.out.println(element + " / " + (element.ordinal() + 1) + " / " + element.getValue());
        }
    }
}
