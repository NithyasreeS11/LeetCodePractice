class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = 0, c = 0, m = mat.length, n = mat[0].length;
        int arr[] = new int[m*n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = mat[r][c];
            if ((r + c) % 2 == 0) { 
                if(c==n-1) { 
                    r+=1; 
                    }
                else if(r==0){
                    c+=1; 
                    }
                else { 
                    r-=1; 
                    c+=1; 
                    }
            } 
            else{                
                if(r==m-1){
                    c+=1; 
                    }
                else if(c==0){
                    r+=1; 
                    }
                else{ 
                    r+=1; 
                    c-=1; 
                    }
            }   
        }   
        return arr;
    }
}
