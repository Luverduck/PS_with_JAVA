package baekjoon.step00_by_ID.id_30000_30999.p30224;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        boolean hasSeven = input.contains("7");
        boolean isModOfSeven = Integer.parseInt(input) % 7 == 0;

        int flag = 0;
        if(hasSeven) flag |= 2;
        if(isModOfSeven) flag |= 1;
        switch(flag) {
            case 0: bw.append("0"); break;
            case 1: bw.append("1"); break;
            case 2: bw.append("2"); break;
            case 3: bw.append("3"); break;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}