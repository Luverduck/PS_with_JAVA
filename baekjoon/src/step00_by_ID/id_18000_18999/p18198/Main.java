package baekjoon.src.step00_by_ID.id_18000_18999.p18198;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] scoreBoard = new int[2];
        boolean isSameScore = false;
        for (int i = 0; i < input.length(); i += 2) {
            int player = input.charAt(i) - 'A';
            int score = input.charAt(i + 1) - '0';
            scoreBoard[player] += score;
            if (scoreBoard[0] == 10 && scoreBoard[1] == 10) {
                isSameScore = true;
                continue;
            }
            if (isSameScore && Math.abs(scoreBoard[0] - scoreBoard[1]) >= 2) {
                bw.append(input.charAt(i));
                break;
            }
            if (!isSameScore && scoreBoard[player] >= 11) {
                bw.append(input.charAt(i));
                break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

/*
// 문제 조건 중 입력으로 주어지는 기록은 규칙에 따라 진행된 게임의 득점 기록이라고 되어있음
// - Each record will be a correct scoring history of a single completed game, played under the rules described above.
// 따라서 아래와 같이 문제 조건을 고려할 필요 없이 득점 결과를 계산한 후 점수가 높은 플레이어를 출력해도 정답으로 인정됨

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] scoreBoard = new int[2];
        boolean isSameScore = false;
        for (int i = 0; i < input.length(); i += 2) {
            int team = input.charAt(i) - 'A';
            scoreBoard[team] += input.charAt(i + 1) - '0';
        }
        bw.append(scoreBoard[0] > scoreBoard[1] ? "A" : "B");

        bw.flush();
        br.close();
        bw.close();
    }
}
* */