//FizzBuzz
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0) res.add("FizzBuzz");
            else if(i%3==0) res.add("Fizz");
            else if(i%5==0) res.add("Buzz");
            else res.add(Integer.toString(i));
        }
        return res;
    }
}

//Reverse Integer
class Solution {
    public int reverse(int x){    
        long n = 0;
        while(x!=0){
            n = (n*10) + (x%10);
            x=x/10;
        }
        if(n > Integer.MAX_VALUE || n < Integer.MIN_VALUE){
            return 0;
        }
        return (int)n;
    }
}

//Plus one
class Solution {
    public int[] plusOne(int[] arr) {
        int n=arr.length;
        for(int i=n-1; i>=0; i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] res=new int[n+1];
        res[0]=1;
        return res;
    }
}

//Number of Steps to Reduce to Zero
class Solution {
    public int numberOfSteps(int num) {
        int s=0;
        while(num>0){
            if(num%2==0) num=num/2;
            else num=num-1;
            s=s+1;

        }
        return s;
    }
}