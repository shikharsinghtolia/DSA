package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayintro {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // input for 2d arrys 
        // int [][] arr1 = new int[3][3];

        // for(int row = 0; row<arr1.length; row++){
        //     for(int col =0; col<arr1[row].length ; col++){
        //         arr1[row][col] = sc.nextInt();
        //     }
        // }
        // for(int row = 0; row<arr1.length; row++){
        //     for(int col =0; col<arr1[row].length ; col++){
        //         System.out.print( arr1[row][col]);
        //     }
        // }


        // Dynamic Arrays 
        int [][] arr = {
            {1,2,3,4},
            {1,2},
            {5,4}
        };

        for(int row = 0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }




    }
}

