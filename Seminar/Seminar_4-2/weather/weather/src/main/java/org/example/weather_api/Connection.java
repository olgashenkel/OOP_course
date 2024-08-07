package org.example.weather_api;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {

    //Зарегистрируйтесь на сайте weatherstack.com и получите свой ключ при использовании заменить!
    private static final String apiKey = "ec*****************";
    //http://api.weatherstack.com/current?access_key=ec*****************&query=moscow

    public String getJson(String city) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();

        URL url = new URL("http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city);
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }

        System.out.println("от сервера пришел ответ: " + stringBuilder);
        return stringBuilder.toString();
    }
}
