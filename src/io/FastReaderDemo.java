package io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author durgesh.soni 2019-07-14
 */
public class FastReaderDemo {

    public static void main(String[] args) {
        FastReaderDemo demo = new FastReaderDemo();
        try {
            demo.process();
        } catch (IOException e) {
            System.out.println("Something wrong in the input format!!");
            e.printStackTrace();
        }
    }

    private void process() throws IOException {
        FastIO fastIO = new FastIO();

        int test = fastIO.nextInt();
        for (int i = 0; i < test; i++) {
            int p = fastIO.nextInt();
            int q = fastIO.nextInt();
            int r = fastIO.nextInt();
            int s = fastIO.nextInt();

            int[] intArray = fastIO.nextIntArray(p);
            long[] longArray = fastIO.nextLongArray(q);
            double[] doubleArray = fastIO.nextDoubleArray(r);
            List<String> strings = new ArrayList<>();

            for (int j = 0; j < s; j++) {
                strings.add(fastIO.next());
            }

            String finalString = fastIO.nextLine();
            System.out.println("Integer array is : " + Arrays.toString(intArray));
            System.out.println("Long array is : " + Arrays.toString(longArray));
            System.out.println("Double array is : " + Arrays.toString(doubleArray));
            System.out.println("String array is : " + strings);
            System.out.println("Final string is : " + finalString);


            fastIO.getWriter().write(Arrays.toString(intArray) + "\n");
            fastIO.getWriter().write(Arrays.toString(longArray) + "\n");
            fastIO.getWriter().write(Arrays.toString(doubleArray) + "\n");
            fastIO.getWriter().write(strings + "\n");
            fastIO.getWriter().write(finalString);

            fastIO.flush();
        }
    }
}


/**
 * Input:
 * 1
 * 2 3 4 5
 * 100 -101
 * 10000000000 -100000000001 100000000002
 * 45.6 -36.77 90.865 102222345678.23
 * Hi this is testing program!
 * Testing is done!!
 */