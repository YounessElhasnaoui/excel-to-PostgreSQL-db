package com.internship.exceltodb.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

public class ValidationConfigLoader {

    private static Map<String, Map<Integer, String[]>> validationConfig;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            TypeFactory typeFactory = mapper.getTypeFactory();
            validationConfig = mapper.readValue(
                    Paths.get("src/main/resources/data/validationConfig.json").toFile(),
                    typeFactory.constructMapType(
                            Map.class,
                            typeFactory.constructType(String.class),
                            typeFactory.constructMapType(Map.class, Integer.class, String[].class)
                    )
            );
        } catch (IOException e) {
            throw new RuntimeException("Failed to load validation configuration", e);
        }
    }

    public static Map<String, Map<Integer, String[]>> getValidationConfig() {
        return validationConfig;
    }
}
