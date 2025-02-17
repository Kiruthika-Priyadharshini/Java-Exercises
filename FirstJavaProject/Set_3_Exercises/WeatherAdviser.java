package Set_3_Exercises;

public class WeatherAdviser {

    public String provideWeatherAdvisory(int temperature) {
        
        if(temperature<0){
            return "It's freezing! Wear a heavy coat.";
        }
        if(temperature<=10){
            return "It's cold! Bundle up.";
        } 
        if (temperature<=20){
            return "It's cool! A light jacket will do.";
        }
        if(temperature>20){
            return "It's warm! Enjoy the day.";
        }
        
//         If the temperature is less than 0, return "It's freezing! Wear a heavy coat."

// If the temperature is between 0 and 10, inclusive, return "It's cold! Bundle up."

// If the temperature is between 11 and 20, inclusive, return "It's cool! A light jacket will do."

// If the temperature is above 20, return "It's warm! Enjoy the day."
        
        return "";
    }
}