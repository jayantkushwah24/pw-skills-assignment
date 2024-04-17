public class string {
    public static void main(String[] args) {
        String str = "aBcJECT";
        replaceAscii(str);
    }

    static void replaceAscii(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                ch = (char) (ch + 1);
                sb.setCharAt(i, ch);
            } else {
                ch = (char) (ch - 1);
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb.toString());
    }

    static void palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (str.charAt(i) == (str.charAt(j))) {
                i++;
                j--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No Palindrome");
        }
    }
}
