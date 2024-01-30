public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        while (true) {
           cnt++;
            if (n %2 ==0) {
                n /= 2;
                
            } else {
                n = n*3 + 1;
               
            }

            if (n == 1) {
                System.out.print(cnt);
                break;
            }

        }
    }
}