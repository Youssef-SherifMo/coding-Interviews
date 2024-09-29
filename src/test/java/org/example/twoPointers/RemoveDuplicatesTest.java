package org.example.twoPointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @ParameterizedTest
    @CsvSource({
            "'2,3,3,3,6,9,9',4",
            "'2,2,2,11',2"
    })
    void testRemoveDuplicates_WhenProvideArray_ShouldReturnLengthWithoutDuplicate(String inputStr,int expected){
        //Arrange
        int[] input = Arrays.stream(inputStr.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        //Act
        int actual=RemoveDuplicates.remove(input);
        //Assert
        assertEquals(expected,actual,()->
                "For Input: "+input+" the expected was "+expected+" but got "+actual);
    }

}