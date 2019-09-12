package Collections;

class GenDemo<T> {
    T ob;
    GenDemo(T o) {
        ob = o;
    }
    T getob() {
        return ob;
    }
    void showType() {
        System.out.println(ob.getClass().getName());
    }
}
