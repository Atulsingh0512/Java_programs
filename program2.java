//find largest element in an array

public class program2 {
    static int arr[]={15,13,16,74};
    static int largest()
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        return max;
    }
    

    public static void main(String[] args)
    {
        System.out.println("The largest element in array is "+largest());
    }
}
