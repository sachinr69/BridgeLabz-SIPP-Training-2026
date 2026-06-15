//Contains Duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}

//Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

//Max Conseccutive ones
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int count=0;
    int max=0;
    for(int i=0; i<nums.length; i++){
       if(nums[i]==1){
        count++;
        if(count>max){
            max=count;
        }
       }
       else count=0;
    }
     return max;
    }
}

//Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int p=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                int temp=nums[p];
                nums[p]=nums[i];
                nums[i]=temp;
                p++;
            }
        }
    }
}

//Rotate Array
class Solution {
    public void reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n= nums.length; 
        k = k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}