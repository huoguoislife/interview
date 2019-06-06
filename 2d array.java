 static int hourglassSum(int[][] arr) {
        int[] sums= new int[16];
        int sum =0;
        int l=0; 
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
            sum=arr[j][i]+arr[j][i+1]+arr[j][i+2]+arr[j+1][i+1]+arr[j+2][i]+arr[j+2][i+1]+arr[j+2][i+2];               
            sums[0+l]=sum;  
            l++;
            }
        } 
        int max=sums[0];
        for(int k=1;k<16;k++){
            if (sums[k] > max)
            {
                max = sums[k];
            }
        }
        return max;
    }
