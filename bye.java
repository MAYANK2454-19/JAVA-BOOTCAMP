import java.util.Scanner;
public class bye {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a,rem;
       System.out.println("ENTER YOUR NUMBER : ");
       a= sc.nextInt();
       while (a!=0) {
        rem=a%10;
        a=a/10;
        System.out.print(rem);
       }
        
     sc.close();
    }
    
}
