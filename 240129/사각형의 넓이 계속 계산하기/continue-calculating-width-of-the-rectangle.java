public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char c = sc.next().charAt(0);
            System.out.println(a*b);
            if (c == 'C'){
                break;
            } else 
             continue;
        }
    }
}