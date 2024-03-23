public class RemoveDupSorted{
    static int removeDuplicates(int[] nums){
        int rd = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[rd] != nums[i]){
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd+1;
    }
    public static void main(String[] args) {
        int[] ar = {2,2,3,3,4,6,6};
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]);
        }
        int rd = removeDuplicates(ar);
        System.out.println();
        for(int i=0; i<rd;i++){
            System.out.print(ar[i]);
        }
    }
}