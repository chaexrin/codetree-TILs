public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=2;i<=8; i+=2){
            for(int j=b; j>=a; j--){
                System.out.print(j + " * " + i + " = " + j*i + " ");
                 if(j>a){
                    System.out.print("/ ");
                }
            }
            
            System.out.println();
        }
    }
}