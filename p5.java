 import java.util.Scanner;
public class p5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       for(int i=0;i<=4;i++){
         for(int j=0;j<=i;j++){
        System.out.print("*");
     
       }
        System.out.println();
       }
       for(int i=0;i<=3;i++){
         for(int j=3;j>=i;j--){
        //     same can be done using
        //     for(int i=4;i>=0;i--){
        //  for(int j=0;j<=i;j++){
        System.out.print("*");
     
       }
        System.out.println();
       }
        
     sc.close();
    }
    
} 