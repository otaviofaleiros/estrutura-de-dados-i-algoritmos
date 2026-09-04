import java.io.BufferedInputStream;
import java.io.IOException;

public class Questao01 {
    private static final class FastScanner {
        private final BufferedInputStream in = new BufferedInputStream(System.in);
        private final byte[] buffer = new byte[1 << 16];
        private int pointer;
        private int length;

        private int read() throws IOException {
            if (pointer >= length) {
                length = in.read(buffer);
                pointer = 0;
                if (length == -1) {
                    return -1;
                }
            }
            return buffer[pointer++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long value = 0;
            while (c > ' ') {
                value = value * 10 + (c - '0');
                c = read();
            }
            return value * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner();
        int n = (int) scanner.nextLong();
        long x = scanner.nextLong();
        long[] lista = new long[n + 1];

        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextLong();
        }

        int esquerda = 0;
        int direita = n;

        while (esquerda < direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (lista[meio] < x) {
                esquerda = meio + 1;
            } else {
                direita = meio;
            }
        }

        for (int i = n; i > esquerda; i--) {
            lista[i] = lista[i - 1];
        }
        lista[esquerda] = x;

        StringBuilder saida = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                saida.append(' ');
            }
            saida.append(lista[i]);
        }

        System.out.println(saida);
    }
}
