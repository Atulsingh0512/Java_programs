
//reverse an array

public class program5 {

    static void reverse(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] Strings) {
        int arr[] = { 1, 2, 3, 4, 5, };
        int n = arr.length;
        reverse(arr, 0, 4);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

    }

}
