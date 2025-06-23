package org.example.slidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringKDistinctTest {

    @ParameterizedTest
    @CsvSource({
            "'araaci', 2 ,4",
            "'araaci', 1, 2",
            "'cbbebi', 3, 5"
    })
    void testFindLength(String inputStr, int k ,int expected){
        //Act
        int actual= LongestSubstringKDistinct.findLength(inputStr,k);
        //Assert
        assertEquals(expected,actual,()->
                "For Input: "+ inputStr +" the expected was "+expected+" but got "+actual);
    }
}