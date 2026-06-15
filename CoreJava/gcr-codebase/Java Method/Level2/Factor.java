import java.util.*;

public class Factors {

    static int[] getFactors(int n) {
        int count = 0;

        for(int i=1;i<=n;i++)
            if(n%i==0) count++;

        int[] factors = new int[count];
        int index = 0;

        for(int i=1;i<=n;i++)
            if(n%i==0)
                factors[index++] = i;

        return factors;
    }

    static int sumFactors(int[] arr){
        int sum=0;
        for(int x:arr) sum+=x;
        return sum;
    }

    static long productFactors(int[] arr){
        long product=1;
        for(int x:arr) product*=x;
        return product;
    }

    static double sumSquareFactors(int[] arr){
        double sum=0;
        for(int x:arr)
            sum += Math.pow(x,2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] factors=getFactors(n);

        System.out.println(Arrays.toString(factors));
        System.out.println("Sum = "+sumFactors(factors));
        System.out.println("Product = "+productFactors(factors));
        System.out.println("Sum of Squares = "+sumSquareFactors(factors));
    }
}