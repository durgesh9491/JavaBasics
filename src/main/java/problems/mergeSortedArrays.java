package problems;

import io.FastIO;
import javafx.util.Pair;

import java.io.IOException;
import java.util.*;

/**
 * @author durgesh.soni
 */
public class mergeSortedArrays {
    public static void main(String[] args) throws IOException {
        FastIO io = new FastIO();

        int t = io.nextInt();
        for (int i = 0; i < t; i++) {
            int k = io.nextInt();
            int n = io.nextInt();
            int[][] inp = new int[k][n];

            for (int j = 0; j < k; j++) {
                inp[j] = io.nextIntArray(n);
            }

            List<Integer> ans = new ArrayList<>();
            Comparator<Pair<Integer, Integer>> comp = (a, b) -> {
                int x = a.getKey();
                int y = a.getValue();
                int p = b.getKey();
                int q = b.getValue();

                if (inp[x][y] == inp[p][q]) return 0;
                return inp[x][y] < inp[p][q] ? -1 : 1;
            };

            Queue<Pair<Integer, Integer>> minQ = new PriorityQueue<>(comp);

            for (int j = 0; j < k; j++) {
                minQ.offer(new Pair<>(j, 0));
            }

            while (!minQ.isEmpty()) {
                Pair<Integer, Integer> p = minQ.poll();
                int x = p.getKey();
                int y = p.getValue();
                ans.add(inp[x][y]);
                if (y + 1 < n) {
                    minQ.offer(new Pair<>(x, y + 1));
                }
            }

            System.out.println("Merged output is : " + ans);
            System.out.println("ans size : " + ans.size());
        }
    }
}

/**
 * 1 4 4 1 5 7 9 -10 3 6 8 -3 -1 2 3 -15 -11 -9 4
 */
