import java.util.Scanner;

public class Main {
    private static int getChange(int m) {
        int ans=0;

        while(m>=10){
            m-=10;
            ans++;
        }
        while(m>=5 && m<10){
            m-=5;
            ans++;
        }
        while(m>0 && m<5){
            m-=1;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}
