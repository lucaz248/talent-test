package com.igz.talenttest.model;

/**
 * The input data
 */
public class InputData {
    /**
     * The decimal value
     */
    private Integer decimal;
    /**
     * The binary sum of decimal value
     */
    private Integer binarySum;

    public InputData(Integer decimal, Integer binarySum) {
        this.decimal = decimal;
        this.binarySum = binarySum;
    }

    public Integer getDecimal() {
        return decimal;
    }

    public void setDecimal(Integer decimal) {
        this.decimal = decimal;
    }

    public Integer getBinarySum() {
        return binarySum;
    }

    public void setBinarySum(Integer binarySum) {
        this.binarySum = binarySum;
    }
}
