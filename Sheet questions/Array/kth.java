public class kth {
    public static void print(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {33, 44, 22, 66, 77};
        int key = 33;
        print(arr, key);
    }
}
