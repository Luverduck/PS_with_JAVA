package p02_math;

public class Math01 {
    public static void main(String[] args) {

        int A = 10, B = 20;

        // 최대값
        int mathMax = Math.max(A, B);
        System.out.println("mathMax = " + mathMax);

        // 최소값
        int mathMin = Math.min(A, B);
        System.out.println("mathMin = " + mathMin);

        // 절대값
        int mathAbs = Math.abs(A - B);
        System.out.println("mathAbs = " + mathAbs);

        // 거듭제곱
        int C = 9;
        double mathPow = Math.pow(C, 2);
        System.out.println("mathPow = " + mathPow);

        // 제곱근
        double mathSqrt = Math.sqrt(C);
        System.out.println("mathSqrt = " + mathSqrt);

        double P = 1.0, Q = 0.5;
        // 반올림
        double mathRound = Math.round(P + Q);
        System.out.println("mathRound = " + mathRound);
        // 올림
        double mathCeil = Math.ceil(P + Q);
        System.out.println("mathCeil = " + mathCeil);
        // 내림
        double mathFloor = Math.floor(P + Q);
        System.out.println("mathFloor = " + mathFloor);

    }
}
