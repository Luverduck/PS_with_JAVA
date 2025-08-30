package baekjoon.src.step00_by_ID.id_02000_02999.p02745;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String grade = br.readLine();
        if (grade.equals("F"))
            bw.append("0.0");
        else {
            double score = 0;
            char fir = grade.charAt(0);
            char sec = grade.charAt(1);
            switch(fir) {
                case 'A': score = 4.0; break;
                case 'B': score = 3.0; break;
                case 'C': score = 2.0; break;
                case 'D': score = 1.0; break;
            }
            if(sec == '+') score += 0.3;
            else if(sec == '-') score -= 0.3;
            bw.append(String.valueOf(score));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}