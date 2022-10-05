package arrays;

public class reverse {

    static void reversearr(int []arr, int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e] = temp;
            s++;
            e++;
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        reversearr(arr, 0, 0);
    }
}
