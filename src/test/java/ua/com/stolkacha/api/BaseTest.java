package ua.com.stolkacha.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.BeforeClass;

import static io.restassured.filter.log.LogDetail.ALL;
import static io.restassured.http.ContentType.JSON;
import static ua.com.api.utils.WeatherApiConst.WeatherAPIConstants.APPID;
import static ua.com.api.utils.WeatherApiConst.WeatherAPIConstants.CURRENT_WEATHER_BASE_PATH;

public class BaseTest {

    //add reading from properties file
    private static final String BASE_URI = "http://api.openweathermap.org/data/2.5";
    private static final String API_KEY = "5d1508fb231b20cf6ea4437b77e927b6";

    @BeforeClass
    public static void setUp(){
        RestAssured.requestSpecification =
                new RequestSpecBuilder()
                        .setBaseUri(BASE_URI)
                        .setBasePath(CURRENT_WEATHER_BASE_PATH)
                        .setContentType(JSON)
                        .addParam(APPID, API_KEY)
                        .log(ALL).build();
    }
}
