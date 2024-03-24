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
        if (primeNumber(112222222)) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number.");
        }
    }
    static void oddOrEven(int num){
        if (num % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    static void checkTriangle(int a , int b , int c){
        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
           System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
    static void leapYearOrNot(int year){
        if (year % 400 == 0 || (year % 4 == 0  && year%400 ==0)) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }
    }
    static void sumOfNumber(int num){
        int sum = 0;
        while(num >= 1 ){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10 ; 
        }
        System.out.println("Sum of digit : " + sum);
    }
    static boolean primeNumber(int num){
        System.out.print(num + " is ");
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void fibonacci(int n){
        if (n < 0) {
            
        }
    }
}