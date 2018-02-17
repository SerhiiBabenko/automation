package ua.com.stolkacha.utils.registrationUtils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collection;

public class RegistrationDataUtil {
    private static TestData[] testData;

    public static Collection<Object[]> getRegistrationData(String filePath) {
        Collection data;
        try {
            JsonReader gsonReader = new JsonReader(new FileReader(filePath));

            testData = new Gson().fromJson(gsonReader, TestData[].class);
            data = Arrays.asList(testData);

            return data;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
