package baekjoon.src.step00_by_ID.id_12000_12999.p12756;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aAtk = Integer.parseInt(st.nextToken());
        int aDef = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int bAtk = Integer.parseInt(st.nextToken());
        int bDef = Integer.parseInt(st.nextToken());

        int aTurn = (int) Math.ceil(1.0 * aDef / bAtk);
        int bTurn = (int) Math.ceil(1.0 * bDef / aAtk);

        if (aTurn == bTurn)
            bw.append("DRAW");
        else
            bw.append(aTurn > bTurn ? "PLAYER A" : "PLAYER B");

        bw.flush();
        br.close();
        bw.close();
    }
}