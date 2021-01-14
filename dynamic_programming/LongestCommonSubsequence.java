import java.util.Scanner;

public class Main {
    public static int lcs2(int[] a, int[] b,int len1, int len2){

        int[][] arr=new int[len1+1][len2+1];

        for(int i=0; i<=len1;i++)
            arr[i][0]=0;

        for(int j=0; j<=len2;j++)
            arr[0][j]=0;

        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(a[i]==b[j]){
                    arr[i+1][j+1]=arr[i][j]+1;
                }
                else{
                    arr[i+1][j+1]=Math.max(arr[i][j+1],arr[i+1][j]);
                }
            }
        }
        return arr[len1][len2];
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b,n,m));
    }
}
