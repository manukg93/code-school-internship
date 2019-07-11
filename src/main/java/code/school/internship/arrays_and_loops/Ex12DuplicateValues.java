package code.school.internship.arrays_and_loops;

// Find duplicate values from the array
public class Ex12DuplicateValues {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 2};

        for (int i = 0; i < nums.length; i++) {
            //int count = 1;
            boolean isDuplicated = false;
            int index = -1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    isDuplicated = true;
                    index = j;
                }


            }


            if (isDuplicated) {
                System.out.println(nums[i] + " is duplicated");
            }
        }
    }
}
