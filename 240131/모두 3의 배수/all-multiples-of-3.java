public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

            boolean trois = true;
   int a ;
    
        for(int i=1;i<=5;i++){

            a=sc.nextInt();

            if(a%3 != 0) {

                trois = false;
                break;
               
            }

        }

         if(trois == true)
            System.out.println("1");
        else
            System.out.println("0");

    }
}