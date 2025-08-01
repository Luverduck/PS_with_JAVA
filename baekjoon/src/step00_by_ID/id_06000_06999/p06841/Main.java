package baekjoon.src.step00_by_ID.id_06000_06999.p06841;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String input;
        while (true) {
            input = br.readLine();
            if (input == null) break;
            String trans = map.get(input);
            sb.append(trans != null ? trans : input).append('\n');
        }
        bw.append(sb);

        bw.flush();
        br.close();
        bw.close();
    }

    static Map<String, String> map = new HashMap<>() {
        {put("CU", "see you");}
        {put(":-)", "I’m happy");}
        {put(":-(", "I’m unhappy");}
        {put(";-)", "wink");}
        {put(":-P", "stick out my tongue");}
        {put("(~.~)", "sleepy");}
        {put("TA", "totally awesome");}
        {put("CCC", "Canadian Computing Competition");}
        {put("CUZ", "because");}
        {put("TY", "thank-you");}
        {put("YW", "you’re welcome");}
        {put("TTYL", "talk to you later");}
    };
}