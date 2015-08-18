package cn.sh.xq.elephantweather.test;

import java.io.InputStream;



import cn.sh.xq.elephantweather.services.JsonDataParseWeatherData;
import cn.sh.xq.elephantweather.util.WeatherDataQuary;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String request =WeatherDataQuary.request("Shanghai");
		JsonDataParseWeatherData jdpw =new JsonDataParseWeatherData();
		jdpw.getJsonData(request);


	}

}
