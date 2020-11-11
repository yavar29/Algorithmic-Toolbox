import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int partition(int[] arr, int left, int right){
        int x=arr[left];
        int j=left;
        for(int i=left+1; i<right; i++){
            if(arr[i]<=x){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp2=arr[left];
        arr[left]=arr[j];
        arr[j]=temp2;


        return j;
    }

    public static void quicksort(int[] arr, int left, int right){
        if(left>=right)
            return;
        int m=partition(arr, left, right);
        quicksort(arr, left, m);
        quicksort(arr, m+1, right);
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,6,6};
        int left=0;
        int right=arr.length;
        System.out.println("BEFORE SORTING: "+ Arrays.toString(arr));
        quicksort(arr, left, right);
        System.out.println("AFTER SORTING: "+Arrays.toString(arr));
    }
}
