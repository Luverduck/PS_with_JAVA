package step00_by_ID.id_11000_11999.p11719;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(true) {
            input = br.readLine();
            if(input == null) break;
            bw.append(input).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}