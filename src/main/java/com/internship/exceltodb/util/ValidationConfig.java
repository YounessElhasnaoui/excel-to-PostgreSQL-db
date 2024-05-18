package com.internship.exceltodb.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ValidationConfig {

    private static Map<String, Map<Integer, String[]>> validationConfig;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            validationConfig = mapper.readValue(new File("src/main/resources/data/validationConfig.json"), Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] getPossibleValues(String sheetName, int cellIndex) {
        Map<Integer, String[]> sheetConfig = validationConfig.get(sheetName);
        return sheetConfig != null ? sheetConfig.get(cellIndex) : null;
    }
}
