class Solution {
    public void reverseString(char[] s) {
        char[] res = s.clone() ;
        int temp = 0 ;
        for(int i = res.length-1 ; i >-1 ; i -- ) {
            s[temp] = res[i] ;
            temp ++ ;
        }
    }
}
