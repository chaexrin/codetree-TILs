public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int[] arr = new int[10];

       int cnt =0;
       int sum =0;


       for(int i=0; i< 10; i++) {
        arr[i] = sc.nextInt();
        if(arr[i]==0)
        break;
        cnt++;
     }
     
     for(int i=0; i<cnt; i++) {
        sum += arr[i];
     }
     System.out.print(sum + " ");
     System.out.printf("%.1f", (double)sum/cnt);
     
    }
}