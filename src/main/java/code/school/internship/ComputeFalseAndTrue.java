package code.school.internship;

public class ComputeFalseAndTrue {
    public static void main(String[] args) {
        //ех. {true, false, false, false, true, false}-> 2 true, 4 false
        boolean [] array={true, false, false, false, true, false};
        int sumTrue=0;
        int sumFalse=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==true){
                sumTrue+=1;
            } else if(array[i]==false){
                sumFalse+=1;
            }

        }
        System.out.println("In this array TRUE elements are: " +sumTrue);
        System.out.println("In this array FALSE elements are: " + sumFalse);
    }
}
