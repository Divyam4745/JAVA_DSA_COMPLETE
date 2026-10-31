import java.util.*;

class Solution {
    public List<Boolean> palindromePath(int n, int[][] edges,
                                        String s, String[] queries) {
        List<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        char[] chars = s.toCharArray();
        int LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        int[][] up = new int[LOG][n];
        int[] depth = new int[n];
        int[] tin = new int[n];
        int[] tout = new int[n];
        int[] pref = new int[n];
        int[] iter = new int[n];
        int[] stack = new int[n];

        int top = 0, timer = 0;
        stack[0] = 0;
        up[0][0] = 0;
        pref[0] = 1 << (chars[0] - 'a');
        tin[0] = timer++;

        while (top >= 0) {
            int u = stack[top];

            if (iter[u] < adj[u].size()) {
                int v = adj[u].get(iter[u]++);

                if (v == up[0][u]) continue;

                up[0][v] = u;
                depth[v] = depth[u] + 1;
                pref[v] = pref[u] ^ (1 << (chars[v] - 'a'));
                tin[v] = timer++;
                stack[++top] = v;
            } else {
                tout[u] = timer - 1;
                top--;
            }
        }

        for (int j = 1; j < LOG; j++) {
            for (int i = 0; i < n; i++) {
                up[j][i] = up[j - 1][up[j - 1][i]];
            }
        }

        Fenwick bit = new Fenwick(n);
        List<Boolean> result = new ArrayList<>();

        for (String q : queries) {
            String[] p = q.split(" ");

            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);

                int delta = (1 << (chars[u] - 'a'))
                          ^ (1 << (c - 'a'));

                bit.update(tin[u], delta);

                if (tout[u] + 1 < n) {
                    bit.update(tout[u] + 1, delta);
                }

                chars[u] = c;
            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                int maskU = pref[u] ^ bit.query(tin[u]);
                int maskV = pref[v] ^ bit.query(tin[v]);

                int ancestor = lca(u, v, depth, up);

                int mask = maskU ^ maskV
                         ^ (1 << (chars[ancestor] - 'a'));

                result.add((mask & (mask - 1)) == 0);
            }
        }

        return result;
    }

    private int lca(int u, int v, int[] depth, int[][] up) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = 0; j < up.length; j++) {
            if ((diff & (1 << j)) != 0) {
                u = up[j][u];
            }
        }

        if (u == v) return u;

        for (int j = up.length - 1; j >= 0; j--) {
            if (up[j][u] != up[j][v]) {
                u = up[j][u];
                v = up[j][v];
            }
        }

        return up[0][u];
    }

    class Fenwick {
        int[] tree;
        int n;

        Fenwick(int n) {
            this.n = n;
            tree = new int[n + 1];
        }

        void update(int index, int value) {
            for (int i = index + 1; i <= n; i += i & -i) {
                tree[i] ^= value;
            }
        }

        int query(int index) {
            int ans = 0;

            for (int i = index + 1; i > 0; i -= i & -i) {
                ans ^= tree[i];
            }

            return ans;
        }
    }
}