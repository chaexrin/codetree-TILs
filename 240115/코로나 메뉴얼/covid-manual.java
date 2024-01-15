public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String s_1 = sc.next();
        int tmp_1 = sc.nextInt();

        String s_2 = sc.next();
        int tmp_2 = sc.nextInt();

        String s_3 = sc.next();
        int tmp_3 = sc.nextInt();

        if (s_1.equals("Y") && tmp_1 >= 37) {
            if ((s_2.equals("Y") && tmp_2 >= 37) || (s_3.equals("Y") && tmp_3 >= 37)) {
                System.out.print("E");
            } else {
                System.out.print("N");
            }
        } else {
            if ((s_2.equals("Y") && tmp_2 >= 37) && (s_3.equals("Y") && tmp_3 >= 37)) {
                System.out.print("E");
            } else {
                System.out.print("N");
            }
        }
    }
}