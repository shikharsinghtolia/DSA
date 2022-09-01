import java.util.Scanner;

public class functions{


    static int sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a+b;

        return c;
    }

    static void swap(){
        int a =12;
        int b = 13;
        System.out.println(a+" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        
    }
    public static void main(String[]args){
        // int ans =sum();
        // System.out.println(ans);
        swap();
    }
}