import java.io.BufferedInputStream;
import java.io.IOException;

public class Questao03 {
    private static final class FastScanner {
        private final BufferedInputStream in = new BufferedInputStream(System.in);
        private final byte[] buffer = new byte[1 << 16];
        private int pointer;
        private int length;

        private int read() throws IOException {
            if (pointer >= length) {
                length = in.read(buffer);
                pointer = 0;
                if (length == -1) return -1;
            }
            return buffer[pointer++];
        }

        long nextLong() throws IOException {
            int c;
            do c = read(); while (c <= ' ');
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long value = 0;
            while (c > ' ') {
                value = value * 10 + c - '0';
                c = read();
            }
            return value * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner();
        int n = (int) scanner.nextLong();
        int m = (int) scanner.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        long[] resultado = new long[n + m];

        for (int i = 0; i < n; i++) a[i] = scanner.nextLong();
        for (int i = 0; i < m; i++) b[i] = scanner.nextLong();

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) resultado[k++] = a[i++];
            else resultado[k++] = b[j++];
        }
        while (i < n) resultado[k++] = a[i++];
        while (j < m) resultado[k++] = b[j++];

        StringBuilder saida = new StringBuilder();
        for (int indice = 0; indice < resultado.length; indice++) {
            if (indice > 0) saida.append(' ');
            saida.append(resultado[indice]);
        }
        System.out.println(saida);
    }
}
