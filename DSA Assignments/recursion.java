public class recursion {
    public static void main(String[] args) {
        int[] array = { 3, 4, 5, 6, 7 };
        // System.out.println(maxNumInArray(array, 0, -1));
        // printSquarePattern2(1,1,5);
        // printCharExceptX("XexperXt", 0);
        // printSubsequence("abc", 0, "");
        // System.out.println(binarySearch(array, 3, 0, array.length - 1));
        // print(5);
        // System.out.println(sumOfdigit(12345));
        System.out.println(reverseNumber(12345,0));
        
    }

    public static int reverseNumber(int number , int result) {
        if (number < 1) {
            return result;
        }
        result = (result*10) + (number%10);
        return reverseNumber(number/10, result);
    }

    public static int sumOfdigit(int num){
        if (num < 1) {
            return 0;
        }
        int lastdigit = num%10;
        return lastdigit + sumOfdigit(num/10);
    }

    public static void print(int i) {
        if (i == 0) {
            return;
        }
        print(i-1);
        System.out.println(i);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (nums[mid] == target)
            return mid;
        if (target > nums[mid]) {
            return binarySearch(nums, target, mid + 1, end);
        }
        return binarySearch(nums, target, start, mid - 1);
    }

    static void printSubsequence(String s, int idx, String result) {
        if (idx == s.length()) {
            System.out.println("[" + result + "]");
            return;
        }
        printSubsequence(s, idx + 1, result + s.charAt(idx));
        printSubsequence(s, idx + 1, result);
    }

    static void printSquarePattern(int row, int col, int n) {
        if (row > n)
            return;
        if (col > n) {
            System.out.println();
            printSquarePattern(row + 1, 1, n);
            return;
        }
        System.out.print("*");
        printSquarePattern(row, col + 1, n);
    }

    static void printSquarePattern2(int row, int col, int n) {
        if (row > n)
            return;
        if (col > row) {
            System.out.println();
            printSquarePattern2(row + 1, 1, n);
            return;
        }
        System.out.print("*");
        printSquarePattern2(row, col + 1, n);
    }

    static void printCharExceptX(String s, int index) {
        if (index >= s.length()) {
            return;
        }
        if (s.charAt(index) == 'x' || s.charAt(index) == 'X') {
            printCharExceptX(s, index + 1);
            return;
        }
        System.out.print(s.charAt(index));
        printCharExceptX(s, index + 1);
    }

    static int maxNumInArray(int[] array, int index, int max) {
        if (index >= array.length) {
            return max;
        }
        if (array[index] > max) {
            max = array[index];
        }
        return maxNumInArray(array, index + 1, max);

    }

    static int aPowerB(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a * aPowerB(a, b - 1);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
