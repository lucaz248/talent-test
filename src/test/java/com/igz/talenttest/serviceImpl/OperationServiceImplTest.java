package com.igz.talenttest.serviceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {OperationServiceImpl.class})
public class OperationServiceImplTest {
    @Autowired
    OperationServiceImpl operationService;

    /**
     * For input: {1,15,5,7,3} output should be: {15, 7, 3, 5, 1}
     */
    @Test
    public void binarySortOk() {
        List<Integer> integerListInput = Arrays.asList(1, 15, 5, 7, 3);
        List<Integer> expectedResult = Arrays.asList(15, 7, 3, 5, 1);
        List<Integer> sortedList = operationService.binarySort(integerListInput);

        assertEquals(expectedResult, sortedList);
    }

    @Test
    public void binarySortNotOk() {
        List<Integer> integerListInput = Arrays.asList(1, 15, 5, 7, 3);
        List<Integer> expectedResult = Arrays.asList(15, 7, 5, 3, 1);
        List<Integer> sortedList = operationService.binarySort(integerListInput);

        assertNotEquals(expectedResult, sortedList);
    }

    @Test
    public void binarySortNullOrEmptyList() {
        List<Integer> expectedResult = Arrays.asList(15, 7, 5, 3, 1);
        List<Integer> sortedList = operationService.binarySort(new ArrayList<>());
        assertNotEquals(expectedResult, sortedList);
    }
}