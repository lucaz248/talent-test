package com.igz.talenttest.rest;

import com.igz.talenttest.serviceImpl.OperationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * OperationController used to perform different mathematical operations.
 */
@RestController()
@RequestMapping("operation")
public class OperationController {
    @Autowired
    private OperationServiceImpl operationService;

    /**
     * Given integer list, perform binary sort.
     *
     * @param integers list of decimals
     * @return sorted list
     */
    @PostMapping(value = "/binary-sort")
    public List<Integer> binarySort(@RequestBody List<Integer> integers) {
        return operationService.binarySort(integers);
    }

    /**
     * Given integer list, perform binary sort.
     *
     * @param integers list of decimals
     * @return sorted list
     */
    @GetMapping(value = "/binary-sort/{integers}")
    public List<Integer> binarySortGet(@PathVariable List<Integer> integers) {
        return operationService.binarySort(integers);
    }
}
