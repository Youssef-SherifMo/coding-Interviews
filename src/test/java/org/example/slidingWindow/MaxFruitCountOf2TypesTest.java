package org.example.slidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxFruitCountOf2TypesTest {
    @ParameterizedTest
    @CsvSource({
            "'A,B,C,A,C',3",
            "'A,B,C,B,B,C',5"
    })
    void testFindLength(String inputStr , int expected){
        //Arrange
       char[]input= inputStr.replace(",", "").toCharArray();

        //Act
        int actual= MaxFruitCountOf2Types.findLength(input);
        //Assert
        assertEquals(expected,actual,()->
                "For Input: "+ Arrays.toString(input) +" the expected was "+expected+" but got "+actual);
    }
}