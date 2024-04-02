import java.util.ArrayList;
import java.util.*;

public class array {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        
        integers.set(2, 11);
        integers.set(3, 14);
        System.out.println(integers);
        */

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,3,5};
        addTwoArrays(arr1, arr2);
    }
    static void intersectionOfArray(int[] arr1 , int[] arr2){
        ArrayList<Integer> integers = new ArrayList<>();
        /*
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    integers.add(arr1[i]);
                    arr1[i]= -1223442332;
                    arr2[j] = -233442223;
                }
            }
        }
        */
        //for sorted arrays
        
        int i = 0;
        int j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i < arr1.length  && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                integers.add(arr1[i]);
                i++; j++;
            }else if (arr1[i] < arr2[j]) {
                i++;
            }else{
                j++;
            }
        }
        System.out.println(integers);
    }
    static void addTwoArrays(int[] arr1 , int[] arr2){
        int i = arr1.length -1;
        int j = arr2.length - 1 ;
        int carryNumber = 0 ;
        ArrayList<Integer> sum = new ArrayList<>();
        while(i >= 0 && j >= 0){
           int temp = arr1[i] + arr2[j] + carryNumber;
           sum.addFirst(temp % 10); 
           carryNumber = (temp - (temp%10))/10 ;
            i--; j--;
        }
        while(i >= 0 ){
            sum.addFirst(arr1[i] + carryNumber);
            carryNumber = 0;
            i--;
        }
        while(j >= 0 ){
            sum.addFirst(arr2[j] + carryNumber);
            carryNumber = 0;
            j--;  
        }
        System.out.println(sum);


        /*
        //optimized approach
        int i = arr1.length -1;
        int j = arr2.length - 1 ;
        int carryNumber = 0 ;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i >= 0 || j >= 0){
            int sum = 0;
            if(i >= 0){
                sum += arr1[i];
            }
            if(j >= 0){
                sum += arr2[j];
            }
            sum += carry;
            int rem = sum %10;
            carry = sum /10;
           ans.add(0,rem); 
            i--; j--;
        }
         */
    }
}
