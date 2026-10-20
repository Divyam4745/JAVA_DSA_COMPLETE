
import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        int i = 0;

        while (i < n) {
            int j = i;
            int wordsLength = 0;

            // Find the maximum number of words that fit
            while (j < n &&
                   wordsLength + words[j].length() + (j - i) <= maxWidth) {
                wordsLength += words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            StringBuilder line = new StringBuilder();

            // Last line or a line containing one word: left-justify
            if (j == n || gaps == 0) {
                for (int k = i; k < j; k++) {
                    if (k > i) {
                        line.append(' ');
                    }
                    line.append(words[k]);
                }

                line.append(" ".repeat(maxWidth - line.length()));
            } else {
                // Fully justify the line
                int totalSpaces = maxWidth - wordsLength;
                int spacesPerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j - 1; k++) {
                    line.append(words[k]);
                    line.append(" ".repeat(
                        spacesPerGap + (k - i < extraSpaces ? 1 : 0)
                    ));
                }

                line.append(words[j - 1]);
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}
