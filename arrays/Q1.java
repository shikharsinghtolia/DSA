package arrays;

import java.util.Scanner;

//Arrays from permutation 
class Q1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int input = sc.nextInt();
        int [] arr = new int[input];
        int n = arr.length;
        int [] ans = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Brute force 
        for(int i=0; i< n; i++ ){
            ans[i] = arr[arr[i]];

        }
        for(int i=0; i<ans.length; i++ ){
            System.out.print(ans[i]+" "); 

        }
    }
}
