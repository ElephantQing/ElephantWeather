package cn.sh.xq.elephantweather.services;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cn.sh.xq.elephantweather.bean.WeatherAQI;
import cn.sh.xq.elephantweather.bean.WeatherBasic;
import cn.sh.xq.elephantweather.bean.WeatherDailyForecast;
import cn.sh.xq.elephantweather.bean.WeatherData;
import cn.sh.xq.elephantweather.bean.WeatherHourlyForecast;
import cn.sh.xq.elephantweather.bean.WeatherNow;
import cn.sh.xq.elephantweather.bean.WeatherSuggestion;

public class JsonDataParseWeatherData {
	private final String WEATHER_DATA_FIELD_KEY = "HeWeather data service 3.0";
	private final String STATUS_KEY = "status";
	private final String BASIC_KEY = "basic";
	private final String CITY_KEY = "city";
	private final String CNTY_KEY = "cnty";
	private final String ID_KEY = "id";
	private final String LAT_KEY = "lat";
	private final String LON_KEY = "lon";
	private final String UPDATE_KEY = "update";
	private final String LOC_KEY = "loc";
	private final String UTC_KEY = "utc";

	private WeatherData mWeatherData;
	private JSONObject mJsonDataField;

	public JsonDataParseWeatherData() {
		super();
		mWeatherData = new WeatherData();
	}

	public WeatherData getJsonData(String jsonData) {
		if (jsonData.equals(""))
			return null;
		mJsonDataField = getWeatherDataField(jsonData);
		mWeatherData.setmStatus(getMStatus(mJsonDataField));
		mWeatherData.setmWeatherBasic(getMWeatherBasic(mJsonDataField));
		mWeatherData.setmWeatherNow(getMWeatherNow(mJsonDataField));
		mWeatherData.setmWeatherAQI(getMWeatherAQI(mJsonDataField));
		mWeatherData
				.setmWeatherDaily7List(getMWeatherDaily7List(mJsonDataField));
		mWeatherData
				.setmWeatherHourly3List(getMWeatherHourly3List(mJsonDataField));
		mWeatherData
				.setmWeatherSuggestion(getMWeatherSuggestion(mJsonDataField));
		return mWeatherData;
	}

	private JSONObject getWeatherDataField(String jsonData) {
		if (jsonData == null || jsonData.equals(""))
			return null;
		JSONArray jsonArray;
		try {
			JSONObject jsonObject = new JSONObject(jsonData);
			if (jsonObject.has(WEATHER_DATA_FIELD_KEY)) {
				jsonArray = jsonObject.getJSONArray(WEATHER_DATA_FIELD_KEY);
				return jsonArray.getJSONObject(0); // return the first
													// element(JSOMObject) of
													// the jsonArray.
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private WeatherSuggestion getMWeatherSuggestion(JSONObject jsonData) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<WeatherHourlyForecast> getMWeatherHourly3List(
			JSONObject jsonData) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<WeatherDailyForecast> getMWeatherDaily7List(JSONObject jsonData) {
		// TODO Auto-generated method stub
		return null;
	}

	private WeatherAQI getMWeatherAQI(JSONObject jsonData) {
		// TODO Auto-generated method stub
		return null;
	}

	private WeatherNow getMWeatherNow(JSONObject jsonData) {
		// TODO Auto-generated method stub
		return null;
	}

	private WeatherBasic getMWeatherBasic(JSONObject jsonData) {
		WeatherBasic weatherBasic = new WeatherBasic();
		if (jsonData == null)
			return null;
		JSONObject jsonObject = jsonData;
		if (jsonObject.has(BASIC_KEY)) {
			jsonObject = jsonObject.getJSONObject(BASIC_KEY);
			// Key is city
			if (jsonObject.has(CITY_KEY)) {
				weatherBasic.setCity(jsonObject.getString(CITY_KEY));
			}
			// Key is cnty
			if (jsonObject.has(CNTY_KEY)) {
				weatherBasic.setCnty(jsonObject.getString(CNTY_KEY));
			}
			// Key is id
			if (jsonObject.has(ID_KEY)) {
				weatherBasic.setId(jsonObject.getString(ID_KEY));
			}
			// Key is lat
			if (jsonObject.has(LAT_KEY)) {
				weatherBasic.setLat(jsonObject.getString(LAT_KEY));
			}
			// Key is lon
			if (jsonObject.has(LON_KEY)) {
				weatherBasic.setLon(jsonObject.getString(LON_KEY));
			}
			// Key is update
			if (jsonObject.has(UPDATE_KEY)) {
				jsonObject = jsonObject.getJSONObject(UPDATE_KEY);
				if (jsonObject.has(LOC_KEY)) {
					weatherBasic.setUpdateLoc(jsonObject.getString(LOC_KEY));
				}
				if (jsonObject.has(UTC_KEY)) {
					weatherBasic.setUpdateUtc(jsonObject.getString(UTC_KEY));
				}

			}
			return weatherBasic;
		}
		return null;
	}

	private String getMStatus(JSONObject jsonData) {
		String status;
		if (jsonData == null)
			return null;
		JSONObject jsonObject = jsonData;
		if (jsonObject.has(STATUS_KEY)) {
			status = jsonObject.getString(STATUS_KEY);
			return status;
		}
		return null;
	}

}
