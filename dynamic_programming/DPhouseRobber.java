import java.util.Scanner;

public class Main {
    public static int houseRobber(int houses[]){
        if(houses.length==0){
            return 0;
        }
        if (houses.length == 1) {
            return houses[0];
        }
        if(houses.length==2){
            return Math.max(houses[0], houses[1]);
        }

        int[] DP=new int[houses.length];

        for(int i=2; i<houses.length; i++){
            DP[0]=0;
            DP[1]=houses[1];
            DP[i]=Math.max(DP[i-2] +houses[i],DP[i-1]);
        }
        return DP[houses.length-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int houses[]={1,5,2,1,11,9};
        System.out.println(houseRobber(houses));
    }
}
