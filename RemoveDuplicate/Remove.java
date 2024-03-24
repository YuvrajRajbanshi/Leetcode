package RemoveDuplicate;

public class Remove {

    public static void printArray(int myArray[]) {
        for (int i = 0; i < myArray.length; i++) {

            System.out.print(myArray[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int myArray[] = { 1, 4, 5, 5, 9, 9, 10 };
        int temp[] = new int[myArray.length];
        int j = 0;
        // removeDplcate(myArray);

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] != myArray[i + 1]) {
                temp[j++] = myArray[i];
            }
        }
        printArray(temp);

        System.out.println("The total number of element in current array " + j);

    }

}
