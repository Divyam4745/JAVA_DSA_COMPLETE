
class Solution {
    public int findPermutationDifference(String s, String t) {

        int[] position = new int[26];

        // Store positions of characters in s
        for (int i = 0; i < s.length(); i++) {
            position[s.charAt(i) - 'a'] = i;
        }

        int sum = 0;

        // Calculate permutation difference
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            sum += Math.abs(position[ch - 'a'] - i);
        }

        return sum;
    }
}
