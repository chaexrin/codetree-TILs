public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] arr = new int[10];

         //변수 선언
        int sum135 = 0;
        int sum246 = 0;

        //배열에 값 입력
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        //홀수 번째 합 구하기
        for (int i = 0; i < 10; i += 2) {
            sum135 += arr[i];
        }

        //짝수 번째 합 구하기
        for (int i = 1; i < 10; i += 2) {
            sum246 += arr[i];
        }

        //홀수 번째 합과 짝수 번째 합 크기 비교하기 & 출력
        if (sum135 > sum246) {
            System.out.println(sum135 - sum246);
        }

        else {
            System.out.println(sum246 - sum135);
        }

    }
}