public class Hamming {
    public static long hamming(int n) {
        long h[] = new long[n];
        h[0] = 1;
        long x2 = 2, x3 = 3, x5 = 5;
        int i = 0, j = 0, k = 0;
        for (int index = 1; index < n; index++) {
            h[index] = Math.min(x2, Math.min(x3, x5));
            if (h[index] == x2)  x2 = h[++i] * 2;
            if (h[index] == x3)  x3 = h[++j] * 3;
            if (h[index] == x5)  x5 = h[++k] * 5;
        }
        return h[n-1];
    }
}
