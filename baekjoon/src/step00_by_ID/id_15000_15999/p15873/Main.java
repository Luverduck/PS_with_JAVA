package step00_by_ID.id_15000_15999.p15873;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        if(input.equals("1010"))
            sb.append(20);
        else if(input.contains("10")) {
            input = input.replaceAll("10", "");
            sb.append(10 + Integer.parseInt(input));
        } else {
            int number = Integer.parseInt(input);
            sb.append(number / 10 + number % 10);
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }
}