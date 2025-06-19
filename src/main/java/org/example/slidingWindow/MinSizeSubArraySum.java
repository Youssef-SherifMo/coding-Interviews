package org.example.slidingWindow;

public class MinSizeSubArraySum {
    public static final int findMinSubArray(int s, int[]arr){
        int windowStart=0, minSum=0,windowSize=0, result=Integer.MAX_VALUE;
        for(int windowEnd =0; windowEnd< arr.length; windowEnd ++){
            minSum+=arr[windowEnd];
            while (minSum >= s ){
                windowSize=(windowEnd-windowStart)+1;
                minSum-=arr[windowStart];
                windowStart++;
                result=Math.min(result,windowSize);
            }
        }
        return result;
    }
}
