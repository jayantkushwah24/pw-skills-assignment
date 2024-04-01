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

        int[] arr1 = {1,2,3,4,5,41,42,77,1,5,3,6,8};
        int[] arr2 = {1,3,5,34,56,64,77,100,1,4,6,7};
        intersectionOfArray(arr1, arr2);
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
}
