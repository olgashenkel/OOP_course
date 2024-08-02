package org.example;

import org.example.ui.ConsoleUI;
import org.example.ui.DesktopUI;
import org.example.ui.View;
import org.example.weather_api.Connection;

public class Main {
    public static void main(String[] args) {
        View view = new DesktopUI();
        view.start();
    }
}