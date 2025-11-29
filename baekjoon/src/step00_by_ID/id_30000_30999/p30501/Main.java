package step00_by_ID.id_30000_30999.p30501;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            String name = br.readLine();
            if (name.indexOf('S') != -1) {
                bw.append(name);
                break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}