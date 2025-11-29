package step00_by_ID.id_07000_07999.p07600;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        Set<Character> set = new HashSet<>();
        while(true) {
            input = br.readLine();
            if(input.equals("#")) break;
            input = input.toLowerCase();
            for(int i = 0; i < input.length(); ++i) {
                char c = input.charAt(i);
                if(c >= 'a' && c <= 'z') set.add(c);
            }
            bw.append(String.valueOf(set.size())).append('\n');
            set.clear();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}