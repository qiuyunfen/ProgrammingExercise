package primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    static int n = 30;
    public static void main(String[] args) {
        List<Integer> factors = generate(n);
        for(int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i));
            if( i != factors.size() -1) {
                System.out.print(",");
            }
        }
    }
    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
