public class FAndLIndex {
    public static int[] searchrange(int[] nums, int target){
        int left = findLeftBound(nums, target);
        int right = findRightBound(nums, target);
        return new int[]{left, right};
    }
    private static int findLeftBound(int[] nums, int target){
        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        //Standerd Binary search
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                index = mid;
                high = mid - 1; // Looking at the left sub array
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            return index;
        }
        return high;


    }
    private static int findRightBound(int[] nums, int  target){
        int index = -1;
        int low = 0;
        int high = nums.length - 1;

        //Standerd Binary search
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                index = mid;
                low = mid + 1; // Looking at the right sub array
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        return index;
        }
       // return high;

    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,7,7,8,9};
        int target = 7;
       searchrange(nums, target);
       findLeftBound(nums, target);
       findRightBound(nums, target);
    }
    
}
