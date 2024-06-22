public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

         // 입력받은 정수를 배열에 저장
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열을 역순으로 탐색하며 짝수만 출력
        for(int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

     
    }
}