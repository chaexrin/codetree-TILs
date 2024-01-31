public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

       boolean cdn = false;

       for (int i=a; i<=b; i++) {
        if (1920 % i == 0 && 2880 % i ==0) {
            cdn = true;
        } 
       }

       if (cdn == true)
       System.out.print(1);
       else
       System.out.print(0);
    }
}