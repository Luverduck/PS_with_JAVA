package baekjoon.step00_by_ID.id_04000_04999.p04714;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String input;
        while(true) {
            input = br.readLine();
            if(input.equals("-1.0")) break;
            double X = Double.parseDouble(input);
            double Y = X * 167 / 1000;
            sb.append(String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", X, Y));;
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}