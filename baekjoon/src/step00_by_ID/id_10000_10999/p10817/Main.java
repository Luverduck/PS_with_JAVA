package step00_by_ID.id_10000_10999.p10817;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];
        for (int n = 0; n < nums.length; ++n)
            nums[n] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);
        bw.append(String.valueOf(nums[1]));

        bw.flush();
        br.close();
        bw.close();
    }
}