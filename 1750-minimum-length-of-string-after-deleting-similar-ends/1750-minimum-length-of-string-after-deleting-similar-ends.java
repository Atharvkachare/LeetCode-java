class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int p=0;
        int str=n-1;
        while(p<str && s.charAt(p) == s.charAt(str)){
            char ch = s.charAt(p);

            // del prefix
            while(p<=str && s.charAt(p) == ch){
                p++;
            }
            //del suffix
             while(p<=str && s.charAt(str) == ch){
                str--;
            }

        }

        return(str-p+1);

        
    }
}