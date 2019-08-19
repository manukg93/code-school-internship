package homework12.quiz2;

public class Test5 {
    static String str = "";

    public static void main(String[] args) {
        try {
            str+="a";
            throw new Exception();
        }catch (Exception e){
            str+="b";
        }finally {
            str+="c";
            method();
            str+="d";
        }
        System.out.println(str);
    }
    static void method(){
        throw new NullPointerException();
    }
    //runtime exception
}
