import java.util.Scanner;

public class Main {

    public static int DPChange(int money, int[] coins){
        int MinNumCoins[]=new int[money];
        MinNumCoins[0]=0;
        for(int m=1; m<money; m++){
            int NumCoins=0;
            MinNumCoins[m]=Integer.MAX_VALUE;
            for(int i=0; i<coins.length;i++){
                if(m >= coins[i]){
                    NumCoins=MinNumCoins[m - coins[i]]+1;
                    if(NumCoins <MinNumCoins[m])
                        MinNumCoins[m]=NumCoins;
                }
            }
        }
        return MinNumCoins[money-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        int no_of_coins=sc.nextInt();
        int[] coins=new int[no_of_coins];
        for(int i=0; i< coins.length;i++){
            coins[i]=sc.nextInt();
        }

        System.out.println(DPChange((money +1), coins));
    }
}
