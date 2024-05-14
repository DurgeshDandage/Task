public class Armstrong {


        // Method to calculate the power of a digit
        static int power(int num, int exp) {
            if (exp == 0) {
                return 1;
            }
            return num * power(num, exp - 1);
        }


        static int sumOfPowers(int num, int n) {
            if (num == 0) {
                return 0;
            }
            return power(num % 10, n) + sumOfPowers(num / 10, n);
        }


        static int countDigits(int num) {
            if (num == 0) {
                return 0;
            }
            return 1 + countDigits(num / 10);
        }


        static boolean isArmstrong(int num) {
            int n = countDigits(num);
            return num == sumOfPowers(num, n);
        }

        public static void main(String[] args) {
            int number = 153; // Example number to check
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }

