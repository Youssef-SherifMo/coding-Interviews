package org.example.slidingWindow;

import java.util.HashMap;

public class LongestSubstringKDistinct {

    public static final int findLength(String str,int k){
        int windowStart=0,maxLength=0;
        HashMap<Character,Integer> characterFreq =new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar =str.charAt(windowEnd);
            characterFreq.put(rightChar,characterFreq.getOrDefault(rightChar,0)+1);

            while (characterFreq.size() > k){
                char leftChar= str.charAt(windowStart);
                characterFreq.put(leftChar,characterFreq.get(leftChar)-1);
                if (characterFreq.get(leftChar)==0){
                    characterFreq.remove(leftChar);
                }
                windowStart++;
            }
            maxLength=Math.max(maxLength,(windowEnd-windowStart)+1);
        }

        return maxLength;

    }
}
