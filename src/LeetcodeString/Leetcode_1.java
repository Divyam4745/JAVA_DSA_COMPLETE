package LeetcodeString;

public class Leetcode_1 {
    static String Reverse(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while( i> 0){

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        //check value of i
        if (i < 0) {
            break;
        }
        int j = i;
        // find the staarting index of words
        while (j >= 0 && s.charAt(j) != ' ') {
            j--;
        }
        // jaise hi mera j space wale index pr aayga to wo ruk jayega
        ans.append(s.substring(j + 1, i + 1));

        //remove  faltu ke space
        while (j >= 0 && s.charAt(j) == ' ') {
            j--;
        }
            // Add space between words
        if (j >= 0) {
            ans.append(' ');
        }
            // Move to previous word
        i = j;
    }
    return  ans.toString();
}

    static void main() {
        String s = "  hello world  ";

        System.out.println(Reverse(s));

    }
}
