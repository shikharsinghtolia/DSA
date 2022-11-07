public class stackheightlogn {
    public static int calcPow(int x, int n){
        
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return calcPow(x, n/2) * calcPow(x, n/2);
        }else{
            return calcPow(x, n/2) * calcPow(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 6;
        int ans = calcPow(x, n);
        int ans2 = calcPow(2, 5);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
