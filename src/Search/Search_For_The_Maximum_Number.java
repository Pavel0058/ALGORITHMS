package Search;

public class Search_For_The_Maximum_Number {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 2, 5, 15};
        int max = findMaxNumber(arr);
        System.out.println("Максимальное число " + max);
    }
    public static int findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}