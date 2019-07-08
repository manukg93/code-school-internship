package code.school.internship;

public class FindMissingNumber {
    public static void main(String[] args) {
        //ex. {1,2,3,4,6,7,8,9} 5 is missing
        int [] arr={1,2,3,4,5,6,7,8,9,10,12,13,14,15};
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println(i+1+" is missing number.");
                return;
            }
        }
    }
}
