public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[4];
        int cnt = 0;
        int sum;

        for(int i=0; i<n; i++) {
            sum = 0;
            for (int a = 0; a < 4; a++) {
                arr[a] = sc.nextInt();
                sum += arr[a];
            }

             double avg = (double) sum / 4;

            if (avg >= 60) {
                cnt ++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(cnt);

    }
}