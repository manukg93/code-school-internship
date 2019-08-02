package homework8.exercise2;

public class CustomString {
    char[]chars=new char[5];
    static boolean contains(CharSequence s){
        String a = "hello my friend";
        if(a.contains(s))
            return true;
        return false;
    }
    static String toUpperCase(String str){
        return str.toUpperCase();
    }
    static int lentgh(String str){
        return str.length();
    }

    static boolean startsWith(String str,String str1){
        return str.startsWith(str1);
    }
    static boolean endsWith(String str,String str1){
        return str.endsWith(str1);
    }



}
