package step00_by_ID.id_30000_30999.p30794;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lv = Integer.parseInt(st.nextToken());
        String status = st.nextToken();
        switch(status) {
            case "miss": lv *= 0; break;
            case "bad" : lv *= 200; break;
            case "cool" : lv *= 400; break;
            case "great" : lv *= 600; break;
            case "perfect" : lv *= 1000; break;
        }
        bw.append(String.valueOf(lv));

        bw.flush();
        br.close();
        bw.close();
    }
}