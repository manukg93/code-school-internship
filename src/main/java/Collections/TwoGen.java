package Collections;

public class TwoGen<T, V> {
    T ob1;
    V ob2;
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    void showType() {
        System.out.println("TYpe T: " + ob1.getClass().getName());
        System.out.println("Type 2: " + ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2() {
        return ob2;
    }
}
