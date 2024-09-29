package org.example.twoPointers;

public class RemoveDuplicates {
    static int remove(int[]arr){
        int left=0,right=1,length=0;
        while(right<=arr.length-1){
            if(arr[left]!=arr[right]){
                length++;
                left=right;
            }
            right++;
        }
        if (left!=right)length++;
        return length;
    }
}
