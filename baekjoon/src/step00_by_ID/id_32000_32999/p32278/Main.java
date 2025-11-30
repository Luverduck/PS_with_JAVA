package step00_by_ID.id_32000_32999.p32278;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long input = Long.parseLong(br.readLine());
        if(input <= Short.MAX_VALUE && input >= Short.MIN_VALUE) bw.append("short");
        else if(input <= Integer.MAX_VALUE && input >= Integer.MIN_VALUE) bw.append("int");
        else bw.append("long long");

        bw.flush();
        br.close();
        bw.close();
    }
}