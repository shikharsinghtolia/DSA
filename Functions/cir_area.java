package Functions;

import java.util.Scanner;

public class cir_area {
    static void circumference(int r){
        double pi =3.141;
        double c = 2*pi*r;
        System.out.println(c);

    }
    static void area(int r){
        double pi =3.141;
        double a = pi*r*r;
        System.out.println(a);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circumference(r);
        area(r);
    }
    
}
