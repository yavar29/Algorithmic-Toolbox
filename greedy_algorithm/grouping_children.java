import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int PointsCovered(float[] arr){
        int i=0;
        int n=arr.length;
        int ans=0;
        while(i<=n-1){
            float left=arr[i];
            ans++;
            //System.out.println("left: "+left);
            float right= arr[i]+1;
            //System.out.println("right: "+right);
            while(i<=n-1 && arr[i]<= right) {
                i++;
            }
            //System.out.println("i: "+i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        float arr[]=new float[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextFloat();
        }
        Arrays.sort(arr);
        System.out.println(PointsCovered(arr));

    }
}
