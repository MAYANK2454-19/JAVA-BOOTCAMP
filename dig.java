import java.util.Scanner;
public class dig {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int a,rem,sum=0;
       System.out.println("ENTER YOUR NUMBER : ");
       a= sc.nextInt();
       while (a!=0) {
        rem=a%10;
        a=a/10;
        sum=sum+rem;
       }
        System.out.print(sum);
     sc.close();
    }
    
}
