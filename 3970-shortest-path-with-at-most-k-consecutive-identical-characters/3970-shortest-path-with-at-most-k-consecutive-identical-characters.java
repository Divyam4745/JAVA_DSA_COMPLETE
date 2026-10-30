import java.util.*;

class Solution {

    public int shortestPath(int n, int[][] edges, String labels, int k) {

        if (k <= 0) return -1;

        // Build adjacency list
        List<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        // State: {node, lastChar, count}
        // Store minimum distance for each state
        Map<Long, Long> dist = new HashMap<>();

        // Priority Queue: {cost, node, lastChar, count}
        PriorityQueue<long[]> pq = new PriorityQueue<>(
            Comparator.comparingLong(a -> a[0])
        );

        int startChar = labels.charAt(0) - 'a';

        long startKey = encode(0, startChar, 1, k);

        dist.put(startKey, 0L);

        pq.offer(new long[]{0, 0, startChar, 1});

        while (!pq.isEmpty()) {

            long[] curr = pq.poll();

            long cost = curr[0];
            int node = (int) curr[1];
            int lastChar = (int) curr[2];
            int count = (int) curr[3];

            long key = encode(node, lastChar, count, k);

            if (cost != dist.getOrDefault(key, Long.MAX_VALUE)) {
                continue;
            }

            if (node == n - 1) {
                return (int) cost;
            }

            for (int[] edge : graph[node]) {

                int nextNode = edge[0];
                int weight = edge[1];

                int nextChar = labels.charAt(nextNode) - 'a';

                int nextCount = (nextChar == lastChar)
                    ? count + 1 : 1;

                if (nextCount > k) {
                    continue;
                }

                long newCost = cost + weight;

                long nextKey = encode(
                    nextNode, nextChar, nextCount, k
                );

                if (newCost < dist.getOrDefault(
                    nextKey, Long.MAX_VALUE
                )) {

                    dist.put(nextKey, newCost);

                    pq.offer(new long[]{
                        newCost,
                        nextNode,
                        nextChar,
                        nextCount
                    });
                }
            }
        }

        return -1;
    }

    private long encode(int node, int ch, int count, int k) {

        return ((long) node * 26 + ch) * (k + 1L) + count;
    }
}