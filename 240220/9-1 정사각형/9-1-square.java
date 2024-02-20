public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 9;

        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print(cnt);
                cnt--;
                if(cnt == 0)
                cnt = 9;
            }
            System.out.println();
        }

    }
}