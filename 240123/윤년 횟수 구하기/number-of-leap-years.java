public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int y = 0;

        for(int i=1; i<=n; i++){
            if (i %4 ==0 && i %100 !=0)
            y++;
            else if (i %4==0 && i%100 ==0 && i %400==0)
            y++;
        }

        System.out.print(y);
    }
}