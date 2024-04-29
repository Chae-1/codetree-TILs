import java.util.*;
public class Main {
    static class WeatherDia {
        String date;
        String day;
        String weather;

        public WeatherDia(String date, String day, String weather) {
            this.date = date;
            this.day = day;
            this.weather = weather;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요. 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        WeatherDia[] weatherDias = new WeatherDia[n];
        for(int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            weatherDias[i] = new WeatherDia(date, day, weather);
        }

        WeatherDia printDia = weatherDias[0];
        for (int i = 1; i < n; i++) {
            if (isRainDate(printDia, weatherDias[i])) {
                printDia = weatherDias[i];
            }
        }
        System.out.println(printDia.date + " " + printDia.day + " " + printDia.weather);
    
    }

    private static boolean isRainDate(WeatherDia printDia, WeatherDia weatherDia) {
        
        if (!printDia.weather.equals("Rain")) {
            return true;
        }
        
        String[] printDate = printDia.date.split("-");
        int printYear = Integer.parseInt(printDate[0]);
        int printMonth = Integer.parseInt(printDate[1]);
        int printDay = Integer.parseInt(printDate[2]);
                
        String[] date = weatherDia.date.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        
        if (printYear > year) {
            return false; 
        }

        if (printMonth > month) {
            return false;
        }

        if (printDay > day) {
            return false;
        }

        return true;
    }
}