public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

        String[] input = new String[10];

        for (int i = 0; i < 10; i++) {
            input[i] = sc.next();
        }

        System.out.println(input[1] + " " + input[4] + " " + input[7]);

    }
}