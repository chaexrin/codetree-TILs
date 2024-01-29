public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = 0;
        int cnt = 0;
        double avg;

        while(true) {
          int age = sc.nextInt();
          
            if (age >=30 || age <20) {
                avg = (double) a/cnt;
                System.out.printf("%.2f", avg);
                break;
            }

              
            a += age;
            cnt++;


        }
    }
}