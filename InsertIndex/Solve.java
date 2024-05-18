package InsertIndex;

public class Solve {

    public static int getIndex(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {

                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return low;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 3, 6, 7, 9 };
        int target = 8;

        System.out.println(getIndex(nums, target));

    }
}