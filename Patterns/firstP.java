package Patterns;

public class firstP {

    static void patter1(int n){
        for(int i=1; i<=n;i++){
            // for every row, run the col
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            // when one row is printed we need to add a new line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patter1(6);
    }
    
}
