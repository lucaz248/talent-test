package com.igz.talenttest.service;

import java.util.List;

/**
 * Operations service
 */
public interface OperationService {

    /**
     * Given integer list, perform binary sort.
     *
     * @param integerList List of integers
     * @return Sorted list
     */
    List<Integer> binarySort(List<Integer> integerList);
}
