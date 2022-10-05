package arrays;

public class Q2 {
    static int[] concat(int[]nums){
        int[] ans = new int [nums.length*2];
        int i=0;
        for(int num: nums){
            ans[i] = num;
            ans[i+nums.length] = num;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5};
        System.out.print(concat(nums));
    }
    
}
