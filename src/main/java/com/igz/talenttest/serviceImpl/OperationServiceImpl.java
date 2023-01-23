package com.igz.talenttest.serviceImpl;

import com.igz.talenttest.model.InputData;
import com.igz.talenttest.service.OperationService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Operations service
 */
@Service
public class OperationServiceImpl implements OperationService {
    @Override
    public List<Integer> binarySort(@NotNull List<Integer> integerList) {

        if (integerList == null || integerList.isEmpty()) {
            return new ArrayList<>();
        }

        List<InputData> inputDataModel = new ArrayList<>();

        //Add list to inputData model, and convert decimal to binary sum
        integerList.forEach(i -> inputDataModel.add(new InputData(i,
                Arrays.stream(Integer.toBinaryString(i).split("")).mapToInt(Integer::parseInt).sum())));

        //Sort by binary ones(1) sum. In case of same ones(1) sum, put the minor decimal fist.
        inputDataModel.sort(Comparator.comparing(InputData::getBinarySum).reversed()
                .thenComparing(InputData::getDecimal));

        //Compose sortedList from the inputDataList
        return Arrays.stream(inputDataModel.stream()
                .mapToInt(v -> v.getDecimal()).toArray()).boxed().collect(Collectors.toList());
    }
}
