class Solution {
    public String countAndSay(int n) {
        // Base case: the first sequence is always "1"
        String result = "1";
        
        // Build the sequence iteratively up to n
        for (int i = 2; i <= n; i++) {
            StringBuilder nextSequence = new StringBuilder();
            int count = 1;
            
            // Iterate through the characters of the previous string
            for (int j = 1; j < result.length(); j++) {
                // If current character matches the previous, increment the count
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    // If it changes, append the count and the character to our new string
                    nextSequence.append(count).append(result.charAt(j - 1));
                    // Reset count for the new character
                    count = 1;
                }
            }
            
            // Don't forget to append the final group of characters after the loop ends
            nextSequence.append(count).append(result.charAt(result.length() - 1));
            
            // Move to the next sequence
            result = nextSequence.toString();
        }
        
        return result;
    }
}