import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class SupiriorElement {
   public static  ArrayList<Interger> leaders(int arr[], int n){
        ArrayList<Interger> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i=arr.length - 2; i>=0; i--){
            if(max > arr[i]){
                ans.add(arr[i]);
                max = arr[i];
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n =2;
        int arr[] = {16, 17,4,3,5,2};
        ArrayList<Interger> ans = leaders(arr, n);
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i)+" ");
        }
        
    }

    
}
