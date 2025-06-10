package org.example.slidingWindow;

public class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray(int k, int[] arr) {
        int windowStart = 0,windowSum = 0,result = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
//                if (windowSum > result)
//                    result = windowSum;
                result=Math.max(windowSum,result);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }

}
