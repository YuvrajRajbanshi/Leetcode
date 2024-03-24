package MostWater;

import java.util.*;

public class MostWateInContainer {

    public static int mostWater(ArrayList<Integer> height) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = 0; j < height.size(); j++) {

                int minHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int area = minHeight * width;

                if (max < area) {

                    max = area;
                }

            }
        }

        return max;
    }

    public static int maxWater(int height[]) {

        int idxLeft = 0;
        int idxRight = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (idxLeft < idxRight) {

            int min = Math.min(height[idxLeft], height[idxRight]);
            int width = idxRight - idxLeft;

            int area = min * width;

            if (max < area) {

                max = area;
            }

            if (height[idxLeft] < height[idxRight]) {

                idxLeft++;
            } else {

                idxRight--;
            }

        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("hello world");

        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(2);
        height.add(5);
        height.add(7);
        height.add(2);
        height.add(11);

        System.out.println(mostWater(height));

        int myArray[] = { 1, 2, 5, 7, 2, 11 };

        System.out.println(maxWater(myArray));

    }
}
