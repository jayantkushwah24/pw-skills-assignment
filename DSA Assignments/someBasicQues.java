import java.util.Scanner;

public class someBasicQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // int num1 = sc.nextInt();
        // oddOrEven(12);
        // checkTriangle(30, 90, 60);
        // leapYearOrNot(2100);
        // sumOfNumber(12345);
        // if (primeNumber(112222222)) {
        // System.out.println("Prime Number");
        // } else {
        // System.out.println("Not a Prime Number.");
        // }
        // nthFibonacci(500);
        // armstrongNumber(153);
        int arr[] = { 1, 2, 3, 4, 5 };
        // reverseArray(arr);
        rotateArray(arr, 3);
    }

    static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    static void checkTriangle(int a, int b, int c) {
        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    static void leapYearOrNot(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
    }

    static void sumOfNumber(int num) {
        int sum = 0;
        while (num >= 1) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("Sum of digit : " + sum);
    }

    static boolean primeNumber(int num) {
        System.out.print(num + " is ");
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void nthFibonacci(int n) {
        int firstNum = 1;
        int secondNum = 1;
        if (n <= 0) {
            System.out.println("Enter valid number.");
        } else if (n == 1) {
            System.out.println(n + "th fibonacci number is 1.");
        } else if (n == 2) {
            System.out.println(n + "th fibonacci number is 1.");
        } else {
            int sum = 0;
            for (int i = 0; i < n - 2; i++) {
                sum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = sum;
            }
            System.out.println(n + "th fibonacci number is " + sum);

        }
    }

    static void armstrongNumber(int n) {
        int sum = 0;
        int number = n;
        while (n >= 1) {
            int lastDigit = n % 10;
            int cube = lastDigit * lastDigit * lastDigit;
            sum += cube;
            n /= 10;
        }
        if (sum == number) {
            System.out.println("Armstrong Number.");
        } else {
            System.out.println("Not a armstrong");
        }

    }

    static void reverseArray(int[] arr) {
        int[] resultArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArray[i] = arr[arr.length - 1 - i];
            System.out.print(resultArray[i] + " ");
        }
    }

    static void rotateArray(int[] arr, int k) {

        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}