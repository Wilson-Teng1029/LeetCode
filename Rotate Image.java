class Solution {
    public void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix.length] ;
        int itemp = 0 ;
        int jtemp = 0 ;
        for (int i = 0 ; i < matrix.length ; i ++ ) 
            for (int j = 0 ; j < matrix.length ; j ++) 
                temp[i][j] = matrix[i][j] ;

        for (int i = 0 ; i < temp.length ; i ++) {
            jtemp = 0 ;
            for ( int j = temp.length-1 ; j >= 0 ; j-- ) {
                matrix[itemp][jtemp] = temp[j][i] ;
                jtemp ++ ;
            }
            itemp ++ ;
        }
    }
}
