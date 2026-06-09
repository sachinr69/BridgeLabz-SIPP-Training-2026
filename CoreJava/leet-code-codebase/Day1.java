//Palindrome ------
class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
        int rev=0, c=n;
        while(n>0){
            int rem = n%10;
             rev = rev*10 + rem;
             n = n/10;
        }
        return rev == c;
    }
}

// Integer to roman
class Solution {
    public String intToRoman(int num) {
        final int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<value.length; i++){
            if(num==0){
                break;
            }
           while(num>=value[i]){
            sb.append(symbol[i]);
            num-=value[i];
           }
        }
        return sb.toString();
    }
}

//Subtract the Product and Sum of Digits of an Integer
class Solution {
    public int subtractProductAndSum(int n) {
        int x = 1, y = 0;
       while(n>0) {
            int v = n % 10;
            x *= v;
            y += v;
            n/=10;
        }
        return x - y;
    }
}