package LeetcodeString;

public class Leetcode_5{

    public static int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char currentChar = chars[read];
            int count = 0;

            // Count consecutive same characters
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Store the character
            chars[write] = currentChar;
            write++;

            // Store the count if it is greater than 1
            if (count > 1) {

                String countString = String.valueOf(count);

                for (int i = 0; i < countString.length(); i++) {
                    chars[write] = countString.charAt(i);
                    write++;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int result = compress(chars);

        System.out.println("Compressed Length: " + result);

        System.out.print("Compressed Array: ");

        for (int i = 0; i < result; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}