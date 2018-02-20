package ua.com.stolkacha.api;

import org.junit.Test;
import ua.com.api.CurrentWeatherApi;
import ua.com.api.model.ErrorResponse;
import ua.com.api.model.WeatherResponse;

import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static ua.com.api.enums.City.KYIV;


public class WeatherApiTest extends BaseTest {
    private CurrentWeatherApi api = new CurrentWeatherApi();

    @Test
    public void shouldGetWeatherByCity() {
        String cityName = KYIV.getCity();
        WeatherResponse weatherResponse = api.getWeatherByCity(cityName, WeatherResponse.class);
        assertThat(weatherResponse.getName(), is(cityName));
        assertThat(weatherResponse.getCod(), is(SC_OK));
        assertThat(weatherResponse.getSys().getCountry(), is(KYIV.getCoutryCode()));
    }
    // end::shouldGetWeatherByCity[]

    @Test
    // tag::shouldGetWeatherByCityAndCountryCode[]
    public void shouldGetWeatherByCityAndCountryCode() {
        String cityName = KYIV.getCity();
        String code = KYIV.getCoutryCode();
        WeatherResponse weatherResponse = api.getWeatherByCityAndCountryCode(cityName, code, WeatherResponse.class);

        assertThat(weatherResponse.getName(), is(cityName));
        assertThat(weatherResponse.getCod(), is(SC_OK));

        assertThat(weatherResponse.getSys().getCountry(), is(code));

    }
    // end::shouldGetWeatherByCityAndCountryCode[]

    // tag::shouldGetWeatherByZipCode[]

    @Test
    public void shouldGetWeatherByZipCode() {
        WeatherResponse weatherResponse = api.getWeatherByZip(94040, WeatherResponse.class);

        assertThat(weatherResponse.getName(), is("Mountain View"));
        assertThat(weatherResponse.getCod(), is(SC_OK));
    }
    // end::shouldGetWeatherByZipCode[]

    @Test
    public void shouldGetWeatherByCoordinates() {
        WeatherResponse weatherResponse = api.getWeatherByCoordinates(35, 139, WeatherResponse.class);

        assertThat(weatherResponse.getName(), is("Shuzenji"));
        assertThat(weatherResponse.getCod(), is(SC_OK));
    }

    @Test
    public void shouldNotGetNonExistingCity() {
        ErrorResponse errorResponse = api.getWeatherByCity("MyCity", ErrorResponse.class);

        assertThat(errorResponse.getMessage(), is("city not found"));
        assertThat(errorResponse.getCod(), is("404"));
    }



}
