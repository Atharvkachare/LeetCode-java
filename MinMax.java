public class MinMax {

    static void findMinMax(int[] arr){
        if(arr == null || arr.length==0){
            return;
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            // if(arr[i]<min){
            //     min=arr[i];
            // }
            // if(arr[i]>max){
            //     max=arr[i];
            // }

            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        System.out.print(max+" Maximum ");
        System.out.print(min+" Minimum");
    }

    public static void main(String[] args) {
        int[] arr = {6,2,3,4,1,9};
        findMinMax(arr);
    }
    
}
