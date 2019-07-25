package sorting;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Time in ms
 * stream series : 36024
 * stream parallel : 16706
 * collections sort : 24601
 * array sort : 5568
 * array parallel sort : 1214
 *
 * @author durgesh.soni 2019-07-14
 */
public class SortingMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        final int idx = 50000000;
        final int limit = 100000000;

        Random random = new Random();
        for (int i = 0; i < idx; i++) {
            list.add(random.nextInt(limit));
        }

        int[] copy1 = list.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();
        int[] copy2 = list.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();

        long s = System.currentTimeMillis();
        list.stream().sorted().collect(Collectors.toList());
        long e = System.currentTimeMillis();
        System.out.println("stream series : " + (e - s));

        s = System.currentTimeMillis();
        list.parallelStream().sorted().collect(Collectors.toList());
        e = System.currentTimeMillis();
        System.out.println("stream parallel : " + (e - s));

        s = System.currentTimeMillis();
        Collections.sort(list);
        e = System.currentTimeMillis();
        System.out.println("collections sort : " + (e - s));

        s = System.currentTimeMillis();
        Arrays.sort(copy1);
        e = System.currentTimeMillis();
        System.out.println("array sort : " + (e - s));

        s = System.currentTimeMillis();
        Arrays.parallelSort(copy2);
        e = System.currentTimeMillis();
        System.out.println("array parallel sort : " + (e - s));
    }
}
