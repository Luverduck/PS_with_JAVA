package baekjoon.step00_by_ID.id_13000_13999.p13866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens())
            list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);
        bw.append(String.valueOf(Math.abs(list.get(0) + list.get(3) - list.get(1) - list.get(2))));

        bw.flush();
        br.close();
        bw.close();
    }
}