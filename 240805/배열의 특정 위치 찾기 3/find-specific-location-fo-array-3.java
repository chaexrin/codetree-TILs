public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

       int[] arr = new int[100];
        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();
            arr[count] = num;

            if (num == 0) {
                if (count >= 3) {
                    sum = arr[count - 1] + arr[count - 2] + arr[count - 3];
                    break;
                } else {
                    System.out.println("0 이전에 적어도 3개의 정수가 필요합니다.");
                    return;
                }
            }

            count++;
        }

        System.out.println(sum);
    }
}