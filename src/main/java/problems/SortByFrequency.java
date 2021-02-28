package problems;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> countHash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            countHash.putIfAbsent(num, 0);
            countHash.replace(num, countHash.get(num) + 1);
        }

        System.out.println(countHash);

        List<Pair<Integer, Integer>> numByCountList = countHash.
            entrySet().
            stream().
            map(obj -> new Pair<>(obj.getValue(), obj.getKey())).
            sorted((o1, o2) -> {
                if (o1.getKey().equals(o2.getKey())) {
                    return o1.getValue() - o2.getValue();
                }
                return o2.getKey() - o1.getKey();
            }).
            collect(Collectors.toList());

        for (Pair<Integer, Integer> numByCount : numByCountList) {
            System.out.println(numByCount.getValue() + " count -" + numByCount.getKey());
        }
    }
}
