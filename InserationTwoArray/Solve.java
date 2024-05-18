package InserationTwoArray;

public class Solve {

    public static int[] intersect(int[] nums1, int[] nums2) {

        int i = nums1.length - 1;
        int j = nums2.length - 1;

        int minVal = Math.min(i, j);
        int[] ans = new int[minVal];
        int k = 0;

        while (i > 0 && j > 0) {

            if (nums1[i] == nums2[j]) {

                ans[k++] = nums1[i];
                i = 0;
                j = 0;
            }
            i--;
            j--;

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };

        int[] result = intersect(nums1, nums2);

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i]);
        }

        // int len = nums1.length;
        // System.out.println(len);

    }

}
