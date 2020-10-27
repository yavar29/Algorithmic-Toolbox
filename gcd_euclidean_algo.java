public class Main {

    public static void main(String[] args) {
        System.out.println(GCD(3918848,1653264));
    }

    // EUCLIDEAN ALGORITHM :
    // GCD(A, B) = GCD(B, R) ...where R is the remainder of A/B.

    public static int GCD(int a, int b){
        if(b==0)
            return a;
        return GCD(b,a%b);
    }
}
