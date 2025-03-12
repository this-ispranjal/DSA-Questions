
public class rArrayByRecursion {
    static void f(int i ,int []arr ,int n){
        if(i>=n/2)
        return;

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
//        swap(arr[i], arr[n]);//

        f(i+1,arr,n);

    }

    public static void main(String[] args) {
        int [] arr = {2,34,1,2};

        int n = arr.length;
        f(0, arr,n);
    }
}
