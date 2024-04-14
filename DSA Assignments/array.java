import java.util.ArrayList;
import java.util.*;

public class array {
    public static void main(String[] args) {
        /*
         * ArrayList<Integer> integers = new ArrayList<>();
         * integers.add(1);
         * integers.add(2);
         * integers.add(3);
         * integers.add(4);
         * integers.add(5);
         * 
         * integers.set(2, 11);
         * integers.set(3, 14);
         * System.out.println(integers);
         */

        int[] arr1 = {1,0,1,0,1,0,0,1,0,1 };
        int[] arr2 = { 1, 3, 5 };
        int[][] arr3 = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        int[][] arr4 = {
                { 1, 2 },
                { 4, 5 },
                { 7, 8 }
        };
        sortBinaryArray(arr1);
    }

    static void sortBinaryArray(int[] nums){
        int i=0;
        int j=0;
        while(i<nums.length){
            if (nums[i] == 1 ) {
                i++; 
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++; j++;
            }
            
        }
        for ( i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    static void removeDuplicate(int[] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void setZeroes(int[][] matrix) {
        boolean isRow = false;
        boolean isCol = false;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if (i == 0)
                        isRow = true;
                    if (j == 0)
                        isCol = true;
                }

            }
        }

        for (int i = 01; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        if (isRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

    }

    static void multiplicationOfMatrix(int[][] first, int[][] second) {
        int[][] result = new int[first.length][second[0].length];
        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < second[0].length; j++) {
                int sum = 0;
                for (int j2 = 0; j2 < second.length; j2++) {
                    sum += first[i][j2] * second[j2][j];
                }
                result[i][j] = sum;
            }

        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int[][] arr) {
        int[][] result = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(result[i][j] + ",");
            }
            System.out.println();
        }

    }

    static void printWaveArray(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                // move down
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                // move up
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }

        }
    }

    public static void runningSumOfArray(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            result.add(sum);
        }
        System.out.println(result);
    }

    static void intersectionOfArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> integers = new ArrayList<>();
        /*
         * for (int i = 0; i < arr1.length; i++) {
         * for (int j = 0; j < arr2.length; j++) {
         * if (arr1[i] == arr2[j]) {
         * integers.add(arr1[i]);
         * arr1[i]= -1223442332;
         * arr2[j] = -233442223;
         * }
         * }
         * }
         */
        // for sorted arrays

        int i = 0;
        int j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                integers.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(integers);
    }

    static void addTwoArrays(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carryNumber = 0;
        ArrayList<Integer> sum = new ArrayList<>();
        while (i >= 0 && j >= 0) {
            int temp = arr1[i] + arr2[j] + carryNumber;
            sum.addFirst(temp % 10);
            carryNumber = (temp - (temp % 10)) / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            sum.addFirst(arr1[i] + carryNumber);
            carryNumber = 0;
            i--;
        }
        while (j >= 0) {
            sum.addFirst(arr2[j] + carryNumber);
            carryNumber = 0;
            j--;
        }
        System.out.println(sum);

        /*
         * //optimized approach
         * int i = arr1.length -1;
         * int j = arr2.length - 1 ;
         * int carryNumber = 0 ;
         * ArrayList<Integer> ans = new ArrayList<>();
         * while(i >= 0 || j >= 0){
         * int sum = 0;
         * if(i >= 0){
         * sum += arr1[i];
         * }
         * if(j >= 0){
         * sum += arr2[j];
         * }
         * sum += carry;
         * int rem = sum %10;
         * carry = sum /10;
         * ans.add(0,rem);
         * i--; j--;
         * }
         */
    }
}
