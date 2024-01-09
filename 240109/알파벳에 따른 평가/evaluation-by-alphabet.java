public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       char ch = sc.next().charAt(0);

       if (ch == 'S')
       System.out.println("Superior");
       else if (ch == 'A')
       System.out.println("Excellent");
       else if (ch == 'B')
       System.out.println("Good");
       else if (ch == 'C')
       System.out.println("Usually");
        else if (ch == 'D')
       System.out.println("Effort");
       else
       System.out.println("Failure");
    }
}