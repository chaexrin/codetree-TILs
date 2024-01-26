public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();
       int cnt =0;

       for (int i=1; i<= n; i++){
        if(i %2 !=0 || i %3 !=0 || i %5 !=0) {
            cnt++;
        }
       }

        System.out.print(cnt);

    }
}