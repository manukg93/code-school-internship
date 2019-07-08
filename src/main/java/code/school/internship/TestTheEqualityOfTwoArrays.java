package code.school.internship;

public class TestTheEqualityOfTwoArrays {
    public static void main(String[] args) {
        //{1,2} {2,3,4} not equal , {1,2} {1,2} equal
        int [] arr1={1,2,3,8};
        int [] arr2={2,3,4};
        int [] arr3={1,2,3,7};
        int [] arr4={1,2};
        if(arr1.length!=arr3.length){
            System.out.println("This arrays is not equal.");
        }else if(arr1.length==arr3.length){
            for(int i=0;i<arr1.length;i++){
                if (arr1[i]==arr3[i]){
                    System.out.println("This arrays "+(i+1)+" elements is equal.");

                } else {
                    System.out.println("This arrays "+(i+1) + " elements is not equal.");
                }
            }
        }

    }
}
