import java.util.*;

class Main {

    public static int EditDistance(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        int[][] arr=new int[len1+1][len2+1];

        for(int i=0; i<=len1;i++)
            arr[i][0]=i;

        for(int j=0; j<=len2;j++)
            arr[0][j]=j;

        for(int i=0; i<len1;i++){
            for(int j=0;j<len2;j++){
                if(s.charAt(i)==t.charAt(j)){
                    arr[i+1][j+1]=arr[i][j] ;
                }
                else{
                    arr[i+1][j+1]=1 + Math.min(arr[i][j+1], Math.min(arr[i+1][j], arr[i][j]));
                }
            }
        }
        return arr[len1][len2];
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        String t = scan.next();

        System.out.println(EditDistance(s, t));
    }

}
