package step00_by_ID.id_28000_28999.p28074;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String target = "MOBIS";
        String input = br.readLine();
        for(int i = 0; i < target.length(); ++i) {
            if (input.indexOf(target.charAt(i)) != -1) continue;
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

        br.close();
    }
}