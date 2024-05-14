package WithRecursion;

public class PrimeNo {

    static int i = 2;

    public static void main(String[] args) {
        if (isPrime(17)) {
            System.out.println("Number is the prime");
        } else {
            System.out.println(" Number is not the prime");
        }


    }

    public static boolean isPrime(int n) {

        if (i == n / 2 + 1)
            return true;

            if (n % i == 0)
                return false;
            i++;
            return isPrime(n);

    }
}
