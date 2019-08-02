package homework7.ex2.ex1;

public class Double {
   static double compare(double d1,double d2){
        return java.lang.Double.compare(d1,d2);
    }
    static double minimum(double d1,double d2){
       return java.lang.Double.min(d1,d2);
    }
    static double parse(String dd){
       return java.lang.Double.parseDouble(dd);
    }
}
