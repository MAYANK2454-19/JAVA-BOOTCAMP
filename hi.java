import java.util.Scanner;
public class hi {
public static void main(String[] args){
     int y;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER YOUR YEAR : ");
    y = sc.nextInt();
    if (((y%4==0 && y%100 !=0) || (y%100==0 &&y%400==0)) && (y != 1000 && y != 10000 && y != 100000)) {
        System.out.println("THIS IS A LEAP YAER");
    }
    else
    {
        System.out.println("THIS IS NOT A LEAP YEAR");
    }
    
  sc.close();
}
}