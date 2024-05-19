package com.internship.exceltodb.util;

import java.util.Arrays;
import java.util.Map;

public class ValidationUtil {

    private static final Map<String, Map<Integer, String[]>> validationConfig = ValidationConfigLoader.getValidationConfig();

    public static boolean validate(String sheetName, int cellIndex, String value) {
        Map<Integer, String[]> sheetConfig = validationConfig.get(sheetName);
        if (sheetConfig != null) {
            String[] allowedValues = sheetConfig.get(cellIndex);
            if (allowedValues != null) {
                return Arrays.asList(allowedValues).contains(value);
            }
        }
        return true; // If no specific validation is found, consider it valid
    }
}
