package step00_by_ID.id_28000_28999.p28938;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res = 0;
        while(N-- > 0)
            res += Integer.parseInt(st.nextToken());
        bw.append(res == 0 ? "Stay" : (res > 0 ? "Right" : "Left"));

        bw.flush();
        br.close();
        bw.close();
    }
}