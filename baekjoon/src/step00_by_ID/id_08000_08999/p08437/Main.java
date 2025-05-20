package baekjoon.src.step00_by_ID.id_08000_08999.p08437;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger total = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());

        BigInteger X = total.add(diff).divide(new BigInteger("2"));
        bw.append(X.toString()).append('\n').append(X.subtract(diff).toString());

        bw.flush();
        br.close();
        bw.close();
    }
}