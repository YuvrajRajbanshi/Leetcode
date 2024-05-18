package Power2;

public class Solve {

    public static boolean checkPow(int n) {

        while (n > 1 && n % 2 == 0) {

            n /= 2;

        }

        return 1 == n ? true : false;

    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(checkPow(n));
    }

}
