package Collections;

public class NonGen {
    Object ob;
    NonGen(Object o) {
        ob = o;
    }
    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("The object Ob is related to " + ob.getClass().getName());
    }
}
