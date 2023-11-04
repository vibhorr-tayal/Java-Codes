package Alpha.Recursion;

public class optmizdPow {
            public static int calpow(int a, int n){
            if(n==0){
                return 1;
            }
            int halfpow = calpow(a,n/2);
            int halfpowsq = halfpow * halfpow;

            if(n%2!=0){
                halfpowsq = a * halfpowsq;
            }
            return halfpowsq;
        }
    public static void main(String[] args) {
        System.out.println(calpow(2,5));
    }
}
