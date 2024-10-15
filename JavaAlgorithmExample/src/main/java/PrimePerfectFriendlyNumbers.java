import java.util.Scanner;

public class PrimePerfectFriendlyNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(isPrimeNumber());
        System.out.println(isPerfectNumber());
        System.out.println(isFriendlyNumber());
    }

    static boolean isPrimeNumber() {
        System.out.println("# Prime number check #");
        System.out.print("# Enter a number: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            return false;
        } else if (num == 1) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    static boolean isPerfectNumber() {
        System.out.println("# Perfect number check #");
        System.out.println("# Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        if (num <= 0) {
            return false;
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num)
            return true;
        return false;
    }

    static boolean isFriendlyNumber() {
        System.out.println("# Friendly number check #");
        System.out.print("# Enter the 1st number: ");
        int num = scanner.nextInt();
        System.out.print("# Enter the 2nd number: ");
        int num2 = scanner.nextInt();
        int num_sum = 0, num2_sum = 0;
        if (num <= 0 || num2 <= 0)
            return false;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                num_sum += i;
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0)
                num2_sum += i;
        }
        if (num2 == num_sum && num == num2_sum)
            return true;
        else
            return false;
    }
}
