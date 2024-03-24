package PowerOfN;

/**
 * PowerN
 */
public class PowerN {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x; // Invert x for negative exponent
            n = -n;
        }
        double xnm1 = myPow(x, n - 1);
        double xn = x * xnm1;

        return xn;
    }

    public static void main(String[] args) {
        int power = 10;
        double axar = 2.00000;
        double result = myPow(axar, power);
        System.out.println(result);
    }

}
