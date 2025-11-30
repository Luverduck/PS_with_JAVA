package step00_by_ID.id_04000_04999.p04696;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (true) {
            input = br.readLine();
            if (input.equals("0")) break;
            double N = Double.parseDouble(input);
            double res = N == 1.0 ? 5.0 : (Math.pow(N, 5) - 1) / (N - 1);
            bw.append(String.format("%.2f\n", res));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}