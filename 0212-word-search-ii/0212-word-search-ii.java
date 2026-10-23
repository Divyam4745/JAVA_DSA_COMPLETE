
import java.util.*;

class Solution {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    private TrieNode root;
    private List<String> result;
    private char[][] board;
    private int rows, cols;

    public List<String> findWords(char[][] board, String[] words) {
        this.board = board;
        rows = board.length;
        cols = board[0].length;

        result = new ArrayList<>();
        root = new TrieNode();

        // Build the Trie
        for (String word : words) {
            insert(word);
        }

        // Start DFS from every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(i, j, root);
            }
        }

        return result;
    }

    private void insert(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }

            node = node.children[index];
        }

        node.word = word;
    }

    private void dfs(int r, int c, TrieNode parent) {
        char ch = board[r][c];

        if (ch == '#') {
            return;
        }

        TrieNode node = parent.children[ch - 'a'];

        if (node == null) {
            return;
        }

        // Found a complete word
        if (node.word != null) {
            result.add(node.word);

            // Prevent duplicate results
            node.word = null;
        }

        // Mark this cell as visited
        board[r][c] = '#';

        // Explore four adjacent cells
        if (r > 0) {
            dfs(r - 1, c, node);
        }

        if (r < rows - 1) {
            dfs(r + 1, c, node);
        }

        if (c > 0) {
            dfs(r, c - 1, node);
        }

        if (c < cols - 1) {
            dfs(r, c + 1, node);
        }

        // Restore the original character
        board[r][c] = ch;

        // Remove exhausted Trie branches to improve performance
        boolean hasChildren = false;

        for (TrieNode child : node.children) {
            if (child != null) {
                hasChildren = true;
                break;
            }
        }

        if (!hasChildren && node.word == null) {
            parent.children[ch - 'a'] = null;
        }
    }
}
