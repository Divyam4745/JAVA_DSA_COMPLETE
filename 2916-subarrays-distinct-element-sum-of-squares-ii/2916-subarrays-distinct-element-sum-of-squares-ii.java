
class Solution {
    private static final long MOD = 1_000_000_007L;

    public int sumCounts(int[] nums) {
        int n = nums.length;
        int[] last = new int[100001];

        SegmentTree seg = new SegmentTree(n);
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int x = nums[i];

            // Distinct counts increase by 1 for subarrays
            // starting after the previous occurrence of x.
            int prev = last[x];
            seg.update(prev, i, 1);

            // Sum of squares of distinct counts for subarrays
            // ending at index i.
            ans = (ans + seg.querySquare()) % MOD;

            last[x] = i + 1;
        }

        return (int) ans;
    }

    static class SegmentTree {
        int n;
        long[] sum, square, lazy;
        static final long MOD = 1_000_000_007L;

        SegmentTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            square = new long[4 * n];
            lazy = new long[4 * n];
        }

        void apply(int node, int l, int r, long val) {
            long len = r - l + 1L;

            square[node] = (square[node]
                    + 2 * val % MOD * sum[node] % MOD
                    + len % MOD * val % MOD * val % MOD) % MOD;

            sum[node] = (sum[node] + len * val) % MOD;
            lazy[node] = (lazy[node] + val) % MOD;
        }

        void push(int node, int l, int r) {
            if (lazy[node] == 0 || l == r) return;

            int mid = (l + r) / 2;
            apply(node * 2, l, mid, lazy[node]);
            apply(node * 2 + 1, mid + 1, r, lazy[node]);
            lazy[node] = 0;
        }

        void pull(int node) {
            sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
            square[node] =
                    (square[node * 2] + square[node * 2 + 1]) % MOD;
        }

        void update(int ql, int qr, long val) {
            if (ql > qr) return;
            update(1, 0, n - 1, ql, qr, val);
        }

        void update(int node, int l, int r,
                    int ql, int qr, long val) {
            if (ql <= l && r <= qr) {
                apply(node, l, r, val);
                return;
            }

            push(node, l, r);
            int mid = (l + r) / 2;

            if (ql <= mid)
                update(node * 2, l, mid, ql, qr, val);

            if (qr > mid)
                update(node * 2 + 1, mid + 1, r, ql, qr, val);

            pull(node);
        }

        long querySquare() {
            return square[1];
        }
    }
}

