class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0 ;
        int row = grid.length ;
        int column = grid[0].length ;
        for(int i = 0 ; i < row ; i ++) 
            for(int j = 0 ; j < column ; j ++ ) 
                if (grid[i][j] < 0 ) {
                    ans += column - j ;
                    break;
                }
                
        return ans ;
    }
}
