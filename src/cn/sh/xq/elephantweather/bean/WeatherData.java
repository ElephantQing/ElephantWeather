package cn.sh.xq.elephantweather.bean;

import java.util.List;

/**
 * Created by HomeStudio on 2015/8/12.
 */
public class WeatherData {
    private String mStatus;
    private WeatherBasic mWeatherBasic;
    private WeatherNow mWeatherNow;
    private WeatherAQI mWeatherAQI;
    private List<WeatherDailyForecast> mWeatherDaily7List;
    private List<WeatherHourlyForecast> mWeatherHourly3List;
    private WeatherSuggestion mWeatherSuggestion;

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public WeatherBasic getmWeatherBasic() {
        return mWeatherBasic;
    }

    public void setmWeatherBasic(WeatherBasic mWeatherBasic) {
        this.mWeatherBasic = mWeatherBasic;
    }

    public WeatherNow getmWeatherNow() {
        return mWeatherNow;
    }

    public void setmWeatherNow(WeatherNow mWeatherNow) {
        this.mWeatherNow = mWeatherNow;
    }

    public WeatherAQI getmWeatherAQI() {
        return mWeatherAQI;
    }

    public void setmWeatherAQI(WeatherAQI mWeatherAQI) {
        this.mWeatherAQI = mWeatherAQI;
    }

    public List<WeatherDailyForecast> getmWeatherDaily7List() {
        return mWeatherDaily7List;
    }

    public void setmWeatherDaily7List(List<WeatherDailyForecast> mWeatherDaily7List) {
        this.mWeatherDaily7List = mWeatherDaily7List;
    }

    public List<WeatherHourlyForecast> getmWeatherHourly3List() {
        return mWeatherHourly3List;
    }

    public void setmWeatherHourly3List(List<WeatherHourlyForecast> mWeatherHourly3List) {
        this.mWeatherHourly3List = mWeatherHourly3List;
    }

    public WeatherSuggestion getmWeatherSuggestion() {
        return mWeatherSuggestion;
    }

    public void setmWeatherSuggestion(WeatherSuggestion mWeatherSuggestion) {
        this.mWeatherSuggestion = mWeatherSuggestion;
    }
}
