package Functions;

import java.util.Scanner;

public class vote {
    static void votecheck(int a) {
        if (a >= 18) {
            System.out.print("Go Ahead and VOte for modi ji ");
        } else {
            System.out.print("CHal be ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        votecheck(a);
    }
}
