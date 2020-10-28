public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
   	int b = scanner.nextInt();

    	System.out.println(GCD(a, b));
    }

    // EUCLIDEAN ALGORITHM :
    // GCD(A, B) = GCD(B, R) ...where R is the remainder of A/B.

    public static int GCD(int a, int b){
        if(b==0)
            return a;
        return GCD(b,a%b);
    }
}
