package step00_by_ID.id_05000_05999.p05949;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int iLength = input.length();
        int mod = iLength % 3;
        for(int i = 1; i <= iLength; ++i) {
            bw.append(input.charAt(i - 1));
            if(i % 3 == mod && i != iLength) bw.append(',');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}