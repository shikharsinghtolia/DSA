package Functions;

import java.util.Scanner;

public class sum {
    static void sumlogic(int a,int b){
        int c = a+b;
        System.out.print(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();

        sumlogic(a, b);
    }
    
}
