public class Main {

    public static int BinarySearch(int arr[], int low, int high, int key){
        if(low>high)
            return low-1;
        int mid= low + ((high-low) /2);

        if(arr[mid]==key)
            return mid;
        else if(arr[mid]>key)
            return BinarySearch(arr, low, mid -1, key);
        else
            return BinarySearch(arr, mid +1, high, key);
    }
    public static void main(String[] args) {
        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
        System.out.println(BinarySearch(intArray, 0, intArray.length-1, -27));
    }
}
