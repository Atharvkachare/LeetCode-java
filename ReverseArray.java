public class ReverseArray{
    static void reverse(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,3,2,4,22,55,67,89};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}