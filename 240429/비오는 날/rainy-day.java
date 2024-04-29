import java.util.*;
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        WeatherInfo[] weatherInfos = new WeatherInfo[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            weatherInfos[i] = new WeatherInfo(date, weather, day);
        }

        WeatherInfo info = weatherInfos[0];
        for (int i = 1; i < n; i++) {
            if (isSwap(info, weatherInfos[i])) {
                info = weatherInfos[i];
            }
        }
        System.out.println(info.date + " " + info.day + " " + info.weather);
    }

    private static boolean isSwap(WeatherInfo info, WeatherInfo weatherInfo) {
        if (!info.weather.equals("Rain")) {
            return true;
        }

        if (!weatherInfo.weather.equals("Rain")) {
            return false;
        }

        String[] prevDate = weatherInfo.date.split("-");
        int prevYear = Integer.parseInt(prevDate[0]);
        int prevMonth = Integer.parseInt(prevDate[1]);
        int prevDay = Integer.parseInt(prevDate[2]);

        String[] date = weatherInfo.date.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        if (prevYear > year) {
            return true;
        } else if (prevYear == year) {
            if (prevMonth > month) {
                return true;
            } else if (prevMonth == month) {
                if (prevDay > day) {
                    return true;
                }
            }
        }
        return false;
    }

    static class WeatherInfo {
        String date;
        String weather;
        String day;

        public WeatherInfo(String date, String weather, String day) {
            this.date = date;
            this.weather = weather;
            this.day = day;
        }
    }    
}