import java.util.Random;

public class A_Shuffle_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //Method1
        shuffleArrayusingRandom(arr);
        //Method2
        //shuffleArrayusingdet(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    // We use Random predefined function to shuffle
    public static void shuffleArrayusingRandom(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    // We shuffle the elements by using the deterministic logic
    public static void shuffleArrayusingdet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (i * 3) % arr.length;
            swap(arr, i, j);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
