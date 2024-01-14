//2-Sum

public class program1 {

    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans; 
                }
            }
        }

        return ans; 
    }

    public static void main(String[] args) {
        int target = 5;
        int[] arr = {1, 2, 3};
        int[] result = twoSum(arr, target);

        if (result[0] != 0 || result[1] != 0) {
            System.out.println("The indices of the two numbers whose sum is equal to the target are: "
                    + result[0] + " and " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
