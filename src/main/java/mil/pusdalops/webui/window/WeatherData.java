package mil.pusdalops.webui.window;

public class WeatherData {
	private static String[] categories;
	
	private static Number[] rainfall, precipitation, temperature, temperature2, pressure;
	static {
		setCategories(new String[] {
	                "Jan", "Feb", "Mar", "Apr",
	                "May","Jun", "Jul", "Aug",
	                "Sep", "Oct", "Nov", "Dec"
		});
		setRainfall(new Double[] {
	                49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4});
		setPrecipitation(new Double[] {
	                27.6, 28.8, 21.7, 34.1, 29.0, 28.4, 45.6, 51.7, 39.0,
	                60.0, 28.6, 32.1});
		setTemperature(new Double[] {
	                1.6, 4.9, 5.8, 0.7, 3.1, 13.0, 14.5, 10.8, 5.8,
	                0.7, 11.0, 16.4});
		setTemperature2(new Double[] {
	                7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6});
		setPressure(new Number[] {
	                1016, 1016, 1015.9, 1015.5,
	                1012.3, 1009.5, 1009.6, 1010.2,
	                1013.1, 1016.9, 1018.2, 1016.7});
	}
	public static Number[] getRainfall() {
		return rainfall;
	}
	public static void setRainfall(Number[] rainfall) {
		WeatherData.rainfall = rainfall;
	}
	public static Number[] getPrecipitation() {
		return precipitation;
	}
	public static void setPrecipitation(Number[] precipitation) {
		WeatherData.precipitation = precipitation;
	}
	public static Number[] getTemperature() {
		return temperature;
	}
	public static void setTemperature(Number[] temperature) {
		WeatherData.temperature = temperature;
	}
	public static Number[] getTemperature2() {
		return temperature2;
	}
	public static void setTemperature2(Number[] temperature2) {
		WeatherData.temperature2 = temperature2;
	}
	public static Number[] getPressure() {
		return pressure;
	}
	public static void setPressure(Number[] pressure) {
		WeatherData.pressure = pressure;
	}
	public static String[] getCategories() {
		return categories;
	}
	public static void setCategories(String[] categories) {
		WeatherData.categories = categories;
	}

}
