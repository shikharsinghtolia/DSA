package Functions;

import java.util.Scanner;

public class odd_even {
    static void check(int a){
        if(a%2==0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        check(a);


    }
    
}
