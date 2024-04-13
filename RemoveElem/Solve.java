package RemoveElem;

/**
 * Solve
 */
public class Solve {

    public static void removeElem(int myArray[], int elem) {

        int myAns[] = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == elem) {

                myAns[i] = myArray[i + 1];
            }
        }

        for (int i = 0; i < myAns.length; i++) {

            System.out.print(myAns[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int elem = 3;
        int myArray[] = { 1, 3, 3, 5, 6, 2 };

        removeElem(myArray, elem);
    }
}