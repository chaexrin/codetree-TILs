public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
        System.out.println(1);
        else 
        System.out.println(0);

        if (a > b)
        System.out.println(1);
        else 
        System.out.println(0);

        if (b >= a)
        System.out.println(1);
        else 
        System.out.println(0);

        if (b > a)
        System.out.println(1);
        else 
        System.out.println(0);        

        if (a == b)
        System.out.println(1);
        else 
        System.out.println(0);

        if (a != b)
        System.out.println(1);
        else 
        System.out.println(0);
    }
}