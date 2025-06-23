package org.example.slidingWindow;

import java.util.HashMap;

public class MaxFruitCountOf2Types {
    public static final int findLength(char[] arr){
        int maxLength=0, windowStart=0;
        HashMap<Character,Integer> characterFreq= new HashMap<>();
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            characterFreq.put(arr[windowEnd],characterFreq.getOrDefault(arr[windowEnd],0)+1);
            while (characterFreq.size() > 2){
                characterFreq.put(arr[windowStart],characterFreq.get(arr[windowStart])-1);
                if(characterFreq.get(arr[windowStart])==0){
                    characterFreq.remove(arr[windowStart]);
                }
                windowStart++;
            }
            maxLength=Math.max(maxLength,(windowEnd-windowStart)+1);
        }

        return maxLength;
    }
}
