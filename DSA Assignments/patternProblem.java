/**
 * patternProblem
 */
public class patternProblem {

    public static void main(String[] args) {
        // pattern1(5);
        pattern6(5);
    }

    static void pattern1(int n) {
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

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j < n - 1 - i || j > n + i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        // *
        // ***
        // *****
        // *******
        // *********

    }

    static void pattern3(int n) {
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n / 2) {
                star++;
            } else {
                star--;
            }
        }
        // *
        // **
        // ***
        // **
        // *
    }

    static void pattern4(int n) {
        int row = n;
        int stars = 1;
        int space = row - 1;
        for (int i = 0; i < 2 * row - 1; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < row - 1) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }

        }
        // *
        // ***
        // *****
        // *******
        // *********
        // *******
        // *****
        // ***
        // *
    }

    static void pattern5(int n) {

        int rows = n;
        int stars = n;
        int space = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < stars; j++) {
                if (i == 0 && j == stars - 1) {
                    continue;
                }
                System.out.print("*");
            }
            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            stars--;
            space += 2;
        }
        // *********
        // **** ****
        // *** ***
        // ** **
        // * *
    }

    static void pattern6(int n) {

        int trows = n;
        int stars = 1;
        int space = trows-2;

        for (int i = 01; i <= trows; i++) {
            for (int j = 01; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 01; j <= space; j++) {
                System.out.print(" ");
            }

            int sstars = stars;
            if (i == trows/2 + 1) {
                sstars = stars - 1;
            }
            for (int j = 01; j <= sstars; j++) {
               
                System.out.print("*");
            }
            System.out.println();
            if (i <= trows/2 ) {
        
                stars++;
                space -= 2;
            }else{
                stars--;
                space += 2;
            }
            
        }
// *   *
// ** **
// *****
// ** **
// *   *

    }
}