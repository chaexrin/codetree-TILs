public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
         int[] arr = new int[10];
        int sum =0;
        int cnt =0;
        
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();

            if(arr[i] >=250){
                break;
            }
            sum += arr[i];
            cnt++;
        }

        System.out.print(sum+ " ");
        System.out.printf("%.1f", (float)sum /cnt);
    }
}