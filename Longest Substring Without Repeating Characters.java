class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str = "" ;
        int ans  = 0 ;
        for(int j = 0 ; j < s.length() ; j ++ ){
            for(int i = j ; i < s.length() ; i ++ ) {
                if ( str.contains(String.valueOf(s.charAt(i))) ){
                    str = "" ;
                    break;
                }
                else 
                    str += String.valueOf(s.charAt(i)) ;
                if ( ans < str.length() )
                        ans = str.length() ;
            }
        }
        return ans ;
    }
}
