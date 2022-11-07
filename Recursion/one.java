public class one {
    public static int factorial(int n) {
        if(n==1 || n==0){
            return 1;
        }
        int fact_N1 = factorial(n-1);

        int fact = n*fact_N1;
        return fact ;
        
    }

    public static void print(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        
    }
    public static void main(String[] args) {
        // print(134);
        int ans =factorial(3);
        System.out.println(ans);
    }
    
}
