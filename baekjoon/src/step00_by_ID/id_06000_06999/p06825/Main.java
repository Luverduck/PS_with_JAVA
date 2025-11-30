package step00_by_ID.id_06000_06999.p06825;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double W = Double.parseDouble(br.readLine());
        double H = Double.parseDouble(br.readLine());

        double BMI = W / Math.pow(H, 2);

        if (BMI > 25.0) bw.append("Overweight");
        else if (BMI > 18.5) bw.append("Normal weight");
        else bw.append("Underweight");

        bw.flush();
        br.close();
        bw.close();
    }
}