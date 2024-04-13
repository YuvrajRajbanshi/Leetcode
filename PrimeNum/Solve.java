package PrimeNum;

public class Solve {

    public static int primeNum(int num) {

        if (num > 0) {

            if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {

                return -1;
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        int num = 7;

        int result = primeNum(num);

        if (result == 1) {
            System.out.println("This is prime number ");
        } else {
            System.out.println("This is not a prime number ");
        }
    }

}
