public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();

        if (a % 3 ==0 || a % 5 == 0 )
        System.out.println(1);
        else
        System.out.println(0);

    }
}