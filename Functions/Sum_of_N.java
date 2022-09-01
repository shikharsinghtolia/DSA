package Functions;

import java.util.Scanner;

public class Sum_of_N {
    static void Sum(int n){
        int sum = 0;
        for (int i = 0; i<n; i++){
            sum = sum+i;
            
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n);
    }
    
}
