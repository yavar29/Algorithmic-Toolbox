import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static long MaxPairwiseProduct(long[] num){
        if(num.length ==1)
            return 0;
        Arrays.sort(num);
        return (num[num.length -1] * num[num.length -2]);
    }

    // wrong attempt
    public static long MaxPairwiseProduct2(long[] num){
        int n=num.length;
        int max_index= -1;
        for(int i=0; i<n; i++)
            if((max_index==-1) || (num[i] > num[max_index]))
                max_index=i;

        int max_index2=-1;
        for(int j=0; j<n ; j++)
            if((j!=max_index) && (max_index2 == -1) || (num[j]> num[max_index2]))
                max_index2=j;

        return num[max_index] * num[max_index2];

    }

    public static long MaxPairwiseProduct3(long[] num){
        long result=0;
        for(int i=0; i< num.length ;i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] * num[j] > result)
                    result =num[i]* num[j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        // STRESS TESTING

        while(true){
            int n= rand.nextInt(10) +2;
            System.out.println(n);
            long[] arr=new long[n];
            for(int i=0; i<n; i++){
                int number= rand.nextInt(100);
                arr[i]= (long)number;
                System.out.print(arr[i] + " ");
            }

            System.out.println();
            long res1= MaxPairwiseProduct(arr);
            long res2=MaxPairwiseProduct3(arr);

            if(res1!=res2){
                System.out.print("WRONG ANSWER " + res1 + " " + res2);
                System.out.println();
                break;
            }
            else {
                System.out.print("OK");
                System.out.println();
            }
        }

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0; i< n; i++){
            arr[i]=sc.nextLong();
        }
        System.out.println(MaxPairwiseProduct(arr));
    }
}
