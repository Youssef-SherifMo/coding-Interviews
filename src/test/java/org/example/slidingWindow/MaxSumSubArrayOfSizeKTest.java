package org.example.slidingWindow;

import org.example.twoPointers.RemoveDuplicates;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumSubArrayOfSizeKTest {
    @ParameterizedTest
    @CsvSource({
            "'2,1,5,1,3,2', 3 ,9",
            "'2,3,4,1,5',2,7"
    })
    void testMaxSumSubArrayOfSizeK(String inputStr, int k ,int expected){
        //Arrange
        int[] input = Arrays.stream(inputStr.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        //Act
        int actual= MaxSumSubArrayOfSizeK.findMaxSumSubArray(k,input);
        //Assert
        assertEquals(expected,actual,()->
                "For Input: "+ Arrays.toString(input) +" the expected was "+expected+" but got "+actual);
    }

}