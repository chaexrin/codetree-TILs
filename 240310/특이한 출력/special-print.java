public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        for (int i =1; i<= n; i++){
            for(int j=1; j<=n; j++) {
                if( (i+j) %4 ==0){
                    System.out.println("(" + i + ", "+ j + ") ");
                } else {
                    System.out.print("(" + i + ", "+ j + ") ");
                } 
            }
        }
    }
}