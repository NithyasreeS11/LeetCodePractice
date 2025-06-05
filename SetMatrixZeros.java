class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] a = new int[matrix.length][matrix[0].length];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=matrix[i][j];
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                    for(int x=0;x<n;x++){
                        matrix[i][x]=0;
                    }
                    for(int y=0;y<m;y++){
                        matrix[y][j]=0;
                    }
                }
            }
        }
        
    }
}
