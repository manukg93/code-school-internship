package homework17.ex3;

import java.util.Comparator;

public class AgeSort implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge()-o2.getAge();
    }
}
