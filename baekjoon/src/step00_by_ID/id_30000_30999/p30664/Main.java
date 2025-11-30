package step00_by_ID.id_30000_30999.p30664;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(true) {
            input = br.readLine();
            if(input.equals("0")) break;
            BigInteger N = new BigInteger(input);
            bw.append(N.mod(new BigInteger("42")).equals(BigInteger.ZERO) ? "PREMIADO" : "TENTE NOVAMENTE").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}