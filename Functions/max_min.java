package Functions;
import java.util.Scanner;

public class max_min {

    static void max (int a, int b, int c ){
        
        if(a>b && a>c){
            System.out.print(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    static void min (int a, int b, int c ){
        
        if(a<b && a<c){
            System.out.print(a);
        }else if(b<a && b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        max(a,b,c);      
        min(a,b,c);      
    }
    
}
