package Functions;

import java.util.Scanner;

public class pythagorean {
    static void triplet(int a,int b,int c){
        int as = a*a;
        int bs = b*b;
        int cs = c*c;

        int sum = as+bs;
        if(sum== cs){
            System.out.println("Triplet");
        }else{
            System.out.println("Not A Triplet");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        triplet(a, b, c);
    }
    
}
