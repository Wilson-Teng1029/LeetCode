class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] all = new int[nums1.length+nums2.length] ; 
        int count = 0 ;
        for ( int x :nums1) 
            all[count++]=x;
        for ( int x :nums2) 
            all[count++]=x;
        Arrays.sort(all);
        return  count % 2 == 1 ? (double)all[count/2] : (double)(all[count/2-1] + all[count/2])/2 ;
    }
}
