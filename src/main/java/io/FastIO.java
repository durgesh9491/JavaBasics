package io;

import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * @author durgesh.soni 2019-07-14
 */
public final class FastIO {
    private static final int BUFFER_SIZE = (1 << 15);
    private BufferedReader reader;
    private BufferedWriter writer;
    private StringTokenizer tokenizer;

    public FastIO(InputStream in, OutputStream out) {
        this.setReaderWriter(in, out);
    }

    public FastIO() {
        this.setReaderWriter(System.in, System.out);
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

    public String next() throws IOException {
        while (Objects.isNull(tokenizer) || !tokenizer.hasMoreElements()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) throws IOException {
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = nextDouble();
        return a;
    }

    public String nextLine() throws IOException {
        return reader.readLine();
    }


    public void flush() throws IOException {
        if (Objects.nonNull(reader))
            reader.close();

        if (Objects.nonNull(writer)) {
            writer.close();
        }
    }

    private void setReaderWriter(InputStream in, OutputStream out) {
        reader = new BufferedReader(new InputStreamReader(in), BUFFER_SIZE);
        writer = new BufferedWriter(new OutputStreamWriter(out), BUFFER_SIZE);
    }
}