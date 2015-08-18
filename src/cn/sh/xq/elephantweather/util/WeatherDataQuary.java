package cn.sh.xq.elephantweather.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import cn.sh.xq.elephantweather.bean.WeatherData;

/**
 * Created by HomeStudio on 2015/8/4.
 */
public class WeatherDataQuary {
	public static final String HTTP_URL = "http://apis.baidu.com/heweather/weather/free";
	public static final String API_KEY = "03c0dd41c29fe1f23cb0795f7fa919fa";

	public static String request(String httpArg) {
		String httpRequestUrl;
		BufferedReader reader = null;
		String result = null;
		StringBuffer sbf = new StringBuffer();
		httpRequestUrl = WeatherDataQuary.HTTP_URL + "?city=" + httpArg;
		try {
			URL url = new URL(httpRequestUrl);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod("GET");
			// 填入apikey到HTTP header
			connection.setRequestProperty("apikey", WeatherDataQuary.API_KEY);
			connection.connect();
			InputStream is = connection.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String strRead = null;
			while ((strRead = reader.readLine()) != null) {
				sbf.append(strRead);
				sbf.append("\r\n");
			}
			reader.close();
			result = sbf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
