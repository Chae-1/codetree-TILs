import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

        System.out.println(Arrays.stream(weatherInfos)
                .filter(w -> w.weather.equals("Rain"))
                .sorted(Comparator.comparing(w -> w.date))
                .findFirst()
                .get());
    }

    static class WeatherInfo {
        LocalDate date;
        String weather;
        String day;

        public WeatherInfo(String date, String weather, String day) {
            this.date = LocalDate.parse(date);
            this.weather = weather;
            this.day = day;
        }

        @Override
        public String toString() {
            return date + " " + day + " " + weather;
        }
    }
}