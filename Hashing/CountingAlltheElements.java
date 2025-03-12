
public class CountingAlltheElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 5, 2, 6, 9};
        int[] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        int q = 0;

        System.out.println(hash[q]);
        // while (q --!=0){

        // }
    }
}
