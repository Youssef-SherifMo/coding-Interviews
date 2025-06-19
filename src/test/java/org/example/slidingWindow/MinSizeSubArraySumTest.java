package org.example.slidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubArraySumTest {
    @ParameterizedTest
    @CsvSource({
            "'2,1,5,2,3,2', 7 ,2",
            "'2,1,5,2,8',7,1"
    })
    void testFindMinSubArray(String inputStr, int s ,int expected){
        //Arrange
        int[] input = Arrays.stream(inputStr.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        //Act
        int actual= MinSizeSubArraySum.findMinSubArray(s,input);
        //Assert
        assertEquals(expected,actual,()->
                "For Input: "+ Arrays.toString(input) +" the expected was "+expected+" but got "+actual);
    }

}