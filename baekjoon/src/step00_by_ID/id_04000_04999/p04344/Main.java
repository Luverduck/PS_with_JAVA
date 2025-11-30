package step00_by_ID.id_04000_04999.p04344;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        while (C-- > 0) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            double scoreMean = 0;
            for (int i = 1; i < input.length; ++i)
                scoreMean += Integer.parseInt(input[i]);
            scoreMean /= N;
            int M = 0;
            for (int i = 1; i < input.length; ++i) {
                int score = Integer.parseInt(input[i]);
                if (score > scoreMean) M++;
            }
            bw.append(String.format("%.3f", 1.0 * M * 100 / N)).append("%\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}