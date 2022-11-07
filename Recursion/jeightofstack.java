public class jeightofstack {
    public static int pow(int x,int n) {
        if( x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xPOWnm1 = pow(x, n-1);
        int xPOW = x*xPOWnm1;
        return xPOW;
        
    }
    public static void main(String[] args) {
        int x = 2;
        int n=5;
        int ans = pow(x, n);
        System.out.println(ans);
    }
    
}
