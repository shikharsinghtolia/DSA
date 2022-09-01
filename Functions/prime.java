package Functions;

import java.util.Scanner;

public class prime {

    static void isPrime(int a){
        if(a<= 1){
            System.out.println("Not Prime");
        }

        for(int i = 2; i<a; i++){
            if(a%i==0){
                System.out.println("Not Prime");
            }            
        }
        System.out.println("Prime");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        isPrime(a);
    }
}
