public class Left_Rotate_an_array_by_k_place{
    public static void rotate(int[] nums, int k){
        k=k % nums.length;
        int n = nums.length;
        int[] temp = new int[n];

        // copying orignal array in to the temp array
        for(int i=0; i<n; i++){
            temp[i] = nums[i];
        }

        //copyin gfrom temp array to leaving k element
        for(int i=0; i<n -k; i++){
            nums[i] = temp[i + k];
        }

        // Adding those k element in to the orignal array
        for(int i=0; i<k; i++){
            nums[(n - k) + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=2;
        rotate(nums, k);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}