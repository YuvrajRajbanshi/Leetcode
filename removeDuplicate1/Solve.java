package removeDuplicate1;

public class Solve {

    public static void duplicate(int[] nums) {

        int prev = 0;

        for (int i = 0; i < nums.length; i++) {
            prev = nums[i];
            if (prev != nums[i + 1]) {

                nums[i] = prev;
            }

        }

        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3 };

        duplicate(nums);
    }

}
