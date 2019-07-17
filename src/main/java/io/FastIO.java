package io;

import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * @author durgesh.soni 2019-07-14
 */
public final class FastIO {
    private BufferedReader reader;
    private BufferedWriter writer;
    private StringTokenizer tokenizer;

    FastIO() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public FastIO(String s) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(new File(s)));
    }

    public BufferedReader getReader() {
        return reader;
    }

    public BufferedWriter getWriter() {
        return writer;
    }

    public StringTokenizer getTokenizer() {
        return tokenizer;
    }

    String next() throws IOException {
        while (Objects.isNull(tokenizer) || !tokenizer.hasMoreElements()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    int[] nextIntArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    long[] nextLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) throws IOException {
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = nextDouble();
        return a;
    }

    String nextLine() throws IOException {
        return reader.readLine();
    }


    void flush() throws IOException {
        if (Objects.nonNull(reader))
            reader.close();

        if (Objects.nonNull(writer)) {
            writer.close();
        }
    }
}