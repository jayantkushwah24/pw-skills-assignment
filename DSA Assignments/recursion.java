import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class recursion {
    public static void main(String[] args) {
        int[] array = { 1, 5, 7 };
        // System.out.println(maxNumInArray(array, 0, -1));
        // printSquarePattern2(1,1,5);
        // printCharExceptX("XexperXt", 0);
        // printSubsequence("abc", 0, "");
        // System.out.println(binarySearch(array, 3, 0, array.length - 1));
        // print(5);
        // System.out.println(sumOfdigit(12345));
        // System.out.println(reverseNumber(12345,0));
        // System.out.println(sorted(array, 1));
        // System.out.println(linearSearch(array, 4, 0));
        // System.out.println(rotatedBS(array, 10, 0, array.length-1));
        // patt1(5, 0);
        // quicksort(array, 0, array.length - 1);
        // System.out.println(Arrays.toString(array));
        // System.out.println(skipChar("abbcdabcdab"));
        // subsequence("abc", 0, "");
        // f(4999, 1);
        // count = 0;
        // findWays(0, 0, 3, 3, "");
        // System.out.println(count);
        // encoded("25114", 0, "");
        // frogOnStone(array, 0, 0);
        ans = Integer.MAX_VALUE;
        noOfCoins(array, 11,0);
        System.out.println(ans);
        // steps=0;
        // reduceNo(10);
        // System.out.println(steps);
    }

    public static int steps = 0;
    public static void reduceNo(int num){
        if (num <= 0) {
            return;
        }
        steps++;
        if (num % 3 == 0) {
            reduceNo(num/3);
        }else if(num % 2 == 0) {
            reduceNo(num/2);
        }else{
            reduceNo(num-1);
        }
    }

    public static int ans = Integer.MAX_VALUE;
    public static void noOfCoins(int[] arr, int sum,int total) {
        if (sum == 0) {
            if (total < ans) {
                ans = total;
            }
            return;
        }
        if (sum < 0) {
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            noOfCoins(arr, sum - arr[j], total+1);
        }
    }

    public static void frogOnStone(int[] arr, int idx, int cost) {
        if (idx >= arr.length - 2) {
            System.out.println(cost);
            return;
        }
        int n1 = Math.abs(arr[idx] - arr[idx + 1]);
        int n2 = Math.abs(arr[idx] - arr[idx + 2]);
        if (n1 < n2) {
            frogOnStone(arr, idx + 1, cost + n1);
        } else {
            frogOnStone(arr, idx + 2, cost + n2);
        }
    }

    public static char[] lettesArray = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    public static void encoded(String str, int idx, String output) {
        if (idx >= str.length()) {
            System.out.println(output);
            return;
        }
        encoded(str, idx + 1, output + lettesArray[str.charAt(idx) - '0']);
        if (idx <= str.length() - 2) {
            int twoDigits = Integer.parseInt(str.substring(idx, idx + 2));
            if (twoDigits <= 26) {
                encoded(str, idx + 2, output + lettesArray[twoDigits]);
            }
        }

    }

    public static int count = 0;

    public static void findWays(int i, int j, int m, int n, String output) {
        if (i == m - 1 && j == n - 1) {
            System.out.println(output);
            count++;
            return;
        }
        if (i >= m || j >= n) {
            return;
        }
        findWays(i, j + 1, m, n, output + "R");
        findWays(i + 1, j, m, n, output + "D");
    }

    // public static List<Integer> integer = new ArrayList<Integer>(); ;
    // public static void f(int n, int a ) {
    // if (a > n) {
    // return;
    // } else if(!integer.contains(a)) {
    // integer.add(a);
    // System.out.println(a);
    // }
    // f(n, a * 10);
    // if(a%10 != 9)
    // f(n, a + 1);
    // else return;
    // }

    public static String skipChar(String str) {
        if (str.length() == 0) {
            return "";
        }
        char c = str.charAt(0);
        if (c == 'a') {
            return "" + skipChar(str.substring(1, str.length()));
        } else {
            return c + skipChar(str.substring(1, str.length()));
        }
    }

    public static void quicksort(int[] array, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = array[mid];

        while (s <= e) {
            while (array[s] < pivot) {
                s++;
            }
            while (array[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;
                s++;
                e--;
            }
        }

        quicksort(array, low, e);
        quicksort(array, s, hi);

    }

    public static void mergeSort2(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSort2(arr, s, mid);
        mergeSort2(arr, mid, e);
        merge2(arr, s, mid, e);
    }

    private static void merge2(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            ;
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            ;
            j++;
            k++;
        }
        return mix;
    }

    public static void selection(int[] array, int i, int j, int max) {
        if (j == 0) {
            return;
        }
        if (j > i) {
            if (array[i] > max) {
                selection(array, i + 1, j, array[i]);
            } else {
                selection(array, i + 1, j, max);
            }

        } else {
            int temp = array[j];
            array[j] = max;
            max = temp;
            selection(array, 0, j - 1, 0);
        }
    }

    public static void bubble(int[] array, int i, int j) {
        if (j == 0) {
            return;
        }
        if (i > j) {
            bubble(array, 1, j - 1);
        } else {
            if (array[i - 1] > array[i]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            bubble(array, i + 1, j);
        }

    }

    static void patt1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row <= col) {
            System.out.println();
            patt1(row - 1, 0);

        } else {
            System.out.print("*");
            patt1(row, col + 1);
        }
    }

    public static int rotatedBS(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid;
        }
        if (array[start] <= array[mid]) {
            if (target >= array[start] && target <= array[mid]) {
                return rotatedBS(array, target, start, mid - 1);
            } else {
                return rotatedBS(array, target, mid + 1, end);
            }
        }
        if (target >= array[mid] && target <= array[end]) {
            return rotatedBS(array, target, mid + 1, end);
        }
        return rotatedBS(array, target, start, mid - 1);

    }

    public static int linearSearch(int[] array, int target, int idx) {
        if (idx >= array.length) {
            return -1;
        }
        if (array[idx] == target) {
            return idx;
        }
        return linearSearch(array, target, idx + 1);
    }

    public static boolean sorted(int[] arr, int start) {
        if (start >= arr.length)
            return true;
        if (arr[start] < arr[start - 1]) {
            return false;
        }
        return sorted(arr, start + 1);
    }

    public static int reverseNumber(int number, int result) {
        if (number < 1) {
            return result;
        }
        result = (result * 10) + (number % 10);
        return reverseNumber(number / 10, result);
    }

    public static int sumOfdigit(int num) {
        if (num < 1) {
            return 0;
        }
        int lastdigit = num % 10;
        return lastdigit + sumOfdigit(num / 10);
    }

    public static void print(int i) {
        if (i == 0) {
            return;
        }
        print(i - 1);
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
