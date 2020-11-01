import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int computeMinRefills(int dist, int tank, int[] stops){
        int currentRefill =0;
        int numRefill =0;
        int lastRefill =0;
        while(currentRefill <stops.length-1){
            lastRefill = currentRefill;
            while(currentRefill < stops.length -1 && (stops[currentRefill + 1] - stops[lastRefill]) <=tank){
                currentRefill++;
            }
            if(currentRefill == lastRefill)
                return -1;
            if(currentRefill < stops.length -1)
                numRefill ++;
        }
        return numRefill;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n+2];
        stops[0]=0;
        stops[stops.length-1]=dist;
        for (int i = 1; i < stops.length-1; i++) {
            stops[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(stops));
        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
