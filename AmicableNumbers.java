package Sibunsirpractice;
import java.util.Scanner;
public class AmicableNumbers {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scan.nextInt();

            int sum1 = sumOfDivisors(num1);
            int sum2 = sumOfDivisors(num2);

            if (sum1 == num2 && sum2 == num1) {
                System.out.println(num1 + " and " + num2 + " are amicable numbers.");
            } else {
                System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
            }
        }

        public static int sumOfDivisors(int num) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

