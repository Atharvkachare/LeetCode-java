class Solution {
    static int removeDuplicates(int[] nums) {
         int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
    public static void main(String[] args) {
        int[] ar = {2,2,3,3,4,6,6};
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]);
        }
        int k = removeDuplicates(ar);
        System.out.println();
        for(int i=0; i<k;i++){
            System.out.print(ar[i]);
        }
    }
    }
