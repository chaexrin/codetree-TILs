public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean satisfied = false;

        for (int i=a; i<=b; i++) {
            if(i % c ==0) {
                satisfied = true;
            }
        }

        if (satisfied == true)
        System.out.print("NO");
        else
        System.out.print("YES");
    }
}