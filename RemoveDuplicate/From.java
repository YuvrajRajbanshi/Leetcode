package RemoveDuplicate;

public class From {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String args[]) {
        int myArray[] = { 1, 1, 2 };

        System.out.println("Original Array:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        int newSize = removeDuplicates(myArray);

        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
