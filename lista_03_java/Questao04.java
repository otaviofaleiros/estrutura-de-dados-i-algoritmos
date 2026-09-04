import java.io.BufferedInputStream;
import java.io.IOException;

public class Questao04 {
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
        long pivot = scanner.nextLong();
        long[] numeros = new long[n];
        long[] resultado = new long[n];

        for (int i = 0; i < n; i++) numeros[i] = scanner.nextLong();

        int indice = 0;
        for (long numero : numeros) if (numero < pivot) resultado[indice++] = numero;
        for (long numero : numeros) if (numero == pivot) resultado[indice++] = numero;
        for (long numero : numeros) if (numero > pivot) resultado[indice++] = numero;

        StringBuilder saida = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) saida.append(' ');
            saida.append(resultado[i]);
        }
        System.out.println(saida);
    }
}
