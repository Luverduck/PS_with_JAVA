package baekjoon.src.step00_by_ID.id_16000_16999.p16466;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N + 1];
        for(int n = 1; n <= N; ++n)
            arr[n] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int cur = arr[1];
        if(cur != 1) System.out.println(1);
        else {
            for(int i = 2; i <= N; ++i) {
                if(++cur != arr[i]) {
                    System.out.println(cur);
                    return;
                }
            }
            System.out.println(cur + 1);
        }

        br.close();
    }
}