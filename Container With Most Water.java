class Solution {
    public int maxArea(int[] height) {
        int maxq = 0 ;
        int i = 0 ;
        int j = height.length-1 ;
        while ( i < j ) {
            maxq = Math.max( maxq , Math.min( height[i] , height[j] ) * (j-i) )  ;
            if ( height[i] > height[j] )
                j-- ;
            else 
                i ++ ;
        }
        
        return maxq ;
    }
}
