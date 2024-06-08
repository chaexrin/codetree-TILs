public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;

        // 10개의 정수를 배열에 입력받으며 0이 있는지 확인합니다. 0이 나오지 않았을 경우 짝수의 개수와 합을 구합니다.
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            if(arr[i] % 2 == 0) {
                sum += arr[i];
                cnt++;
            }
        }

        //출력
        System.out.print(cnt + " " + sum);
        
    }
}