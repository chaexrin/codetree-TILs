public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int math = sc.nextInt();
        int eng = sc.nextInt();
        int math2 = sc.nextInt();
        int eng2 = sc.nextInt();

        if (math > math2) {
            System.out.println("A");
        } else 
        System.out.println("B");

        if(math == math2 && eng > eng2) {
            System.out.println("A");
        } else if(math == math2 && eng < eng2)
        System.out.println("B");
        
    }
}