package org.example.twoPointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PairWithTargetSumTest {

    @ParameterizedTest(name = "Test case {index} - input: {0}, target:{1}, expected: {2}")
    @CsvSource({
            "'1,2,3,4,6',6,'1,3'",
            "'2,5,9,11',11,'0,2'",
            "'1,3,5,7', 9, '-1,-1'",
    })
    void testSearch_WhenSortedArrayProvided_ShouldReturnIndexArray(String inputStr, int target, String outputStr) {
        //Arrange
        int[] input = Arrays.stream(inputStr.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] expectedOutput = Arrays.stream(outputStr.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        //Act
        int[] actual = PairWithTargetSum.search(input, target);
        //Assert
        assertArrayEquals(expectedOutput,actual,
                ()-> "for input: "+input+" the expected is "+expectedOutput+
                        " but the actual is "+actual);
    }
}