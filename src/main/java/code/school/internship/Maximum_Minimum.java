package code.school.internship;

public class Maximum_Minimum {
    public static void main(String[] args) {
        double n1 = 1.2, n2 = 0.6, n3 = -2.5, n4 = 0;
        double min=n1;
        double max=n1;
        if(min>n1){
            min=n2;
        }
        if(min>n3){
            min=n3;
        }
        if(min>n4){
            min=n4;
        }
        System.out.println("min="+min);

        if(max<n2){
            max=n2;
        }
        if(max<n3){
            max=n3;
        }
        if(max<n4){
            max=n4;
        }
        System.out.println("max="+max);

   /*
        double[] arr = {1.2, 0.6, -2.5, 0};
        double min = arr[0];
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MIN=" + min);

        for (int i = 0; i < arr.length;i++ ){
            if(arr[i]>max){
                max=arr[2];
            }
        }
        System.out.println("MAX="+max);*/
    }
}
