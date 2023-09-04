class Solution {
    public int reverse(int x) {
        long ans = x ;
        String str = "";
        String sans = "" ;
        char temp ;
        if ( ans >= 0 ) {
            str = Long.toString(ans);
            str = new StringBuilder(str).reverse().toString() ;
            ans = Long.valueOf(str); 
        }
        else {
            ans *= -1  ;
            str = Long.toString(ans);
            str = new StringBuilder(str).reverse().toString() ;
            ans = Long.valueOf(str); 
            ans *= -1 ;
        }
        if ( ans > 2147483647 || ans < -2147483648)return 0 ;
        return (int) ans ;
    }
}
