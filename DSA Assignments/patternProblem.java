/**
 * patternProblem
 */
public class patternProblem {

    public static void main(String[] args) {
        // pattern1(5);
        pattern3(5);
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // *
        // **
        // ***
        // ****
        // *****
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n-1 ; j++) {
                if (j < n-1-i || j > n + i - 1) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    //      *    
    //     ***   
    //    *****  
    //   ******* 
    //  *********
     
    }
    static void pattern3(int n){
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                    System.out.print("*");  
            }
            System.out.println();
            if (i < n/2) {
                star ++ ; 
            } else{
                star--;
            } 
        }
    }
    // *
    // **
    // ***
    // **
    // *
}