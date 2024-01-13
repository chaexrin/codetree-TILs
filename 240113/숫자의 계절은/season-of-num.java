public class Main {
    public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    int m = sc.nextInt();

    if (m == 3 || m == 4 || m == 5) 
    System.out.println("Spring");
    else if (m == 6 || m == 7 || m ==8)
    System.out.println("Summer");
    else if (m == 9 || m == 10 || m == 11)
    System.out.println("Fall");
    else
    System.out.println("Winter");

    }
}