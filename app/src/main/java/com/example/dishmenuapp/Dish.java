package com.example.dishmenuapp;

public class Dish {
    // Класс, представляющий блюдо
     String name;
     String time;
     int imageResId;
    // Конструктор
    public Dish(String name, String time, int imageResId) {
        this.name = name;
        this.time = time;
        this.imageResId = imageResId;
    }
    // Получение данных
    public String getName() {
        return name;
    }
    public String getTime() {
        return time;
    }
    public int getImageResId() {
        return imageResId;
    }
}
