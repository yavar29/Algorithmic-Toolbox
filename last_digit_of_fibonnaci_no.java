import java.util.Scanner;

public class Main {

    public static int getFibonacciLastDigitNaive(int n){
        if(n==0 || n==1)
            return n;

        int arr[]=new int[60];
        arr[0]=0;
        arr[1]=1;

        for(int i=2; i<n+1; i++){
            arr[i] = (arr[i - 1] + arr[i - 2])%10;
        }
        return arr[n];
    }

    public static void main(String[] args) {

        // after every 60 numbers the pattern is repeated

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 60;
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}
