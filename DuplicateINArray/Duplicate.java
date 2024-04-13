package DuplicateINArray;

public class Duplicate {

    public static int findDuplicate(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {

                if (myArray[i] == myArray[j]) {

                    return myArray[i];
                }
            }
        }

        return -1;
    }

    public static void sort(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {

            for (int j = 0; j < myArray.length - 1; j++) {

                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }

    public static void printArra(int myArray[]) {
        for (int i = 0; i < myArray.length; i++) {

            System.out.print(myArray[i] + "  ");
        }
    }

    public static void main(String[] args) {

        int[] myArray = { 1, 3, 4, 5, 6, 3, 3 };

        // findDuplicate(myArray);
        System.out.println(findDuplicate(myArray));

        // sort(myArray);

        // printArra(myArray);
    }

}
