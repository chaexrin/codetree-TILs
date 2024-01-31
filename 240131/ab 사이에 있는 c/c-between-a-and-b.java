public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       boolean condition = false;

       for(int i=a; i<=b; i++) {
        if (i %c ==0) {
            condition = true;
        }
       }

       if (condition == true)
       System.out.println("YES");
       else
       System.out.println("NO");
    }
}