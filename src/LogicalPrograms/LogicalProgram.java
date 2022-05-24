package LogicalPrograms;

import java.util.Scanner;

public class LogicalProgram {
    static void Fibonacci() {
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum;
        System.out.println("For fibonacci series");
        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int Num = n.nextInt();
        while (firstNum <= Num) {
            System.out.println(firstNum + " ");
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }
    }

    static void PerfectNumber() {
        int num;
        int sum = 0;
        int i = 1;
        Scanner n = new Scanner(System.in);
        System.out.println("For perfect number");
        System.out.println("Enter a number");
        num = n.nextInt();
        while (i <= num / 2) {
            if (num % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == num) {
            System.out.println(num + " IS PERFECT NUMBER");
        } else {
            System.out.println(num + " IS NOT PERFECT NUMBER");
        }
    }

    static void PrimeNumber() {
        int num, i, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("For the prime number");
        System.out.print("Enter a Number ");
        num = s.nextInt();
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(" Prime Number.");
        } else {
            System.out.println(" not a Prime Number.");
        }
    }

    static void ReverseNumber() {
        int reverse = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("For reverse number");
        System.out.println("Enter numbers");
        int num = n.nextInt();
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number = " + reverse);
    }

    static void CouponNumbers() {
    }

    public static void main(String[] args) {
        Fibonacci();
        PerfectNumber();
        PrimeNumber();
        ReverseNumber();
    }
}
