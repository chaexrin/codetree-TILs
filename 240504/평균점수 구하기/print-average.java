public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double[] score = new double[8];
        double avg = 0;

        for(int i=0; i<8; i++) {
            score[i] = sc.nextDouble();
            avg += score[i];
        }

        System.out.printf("%.1f", avg/8);
    }
}