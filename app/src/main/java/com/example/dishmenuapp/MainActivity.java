package com.example.dishmenuapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;
     DishAdapter dishAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Получение ссылки в макете
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Создание списка
        List<Dish> dishList = new ArrayList<>();
        // Добавление блюд в список
        dishList.add(new Dish("Pasta", "20 mins", R.drawable.pasta));
        dishList.add(new Dish("Pizza", "30 mins", R.drawable.pizza));
        dishList.add(new Dish("Salad", "10 mins", R.drawable.salat));

        // Создание адаптера
        dishAdapter = new DishAdapter(dishList);
        // Загрузка адаптера, для отображения
        recyclerView.setAdapter(dishAdapter);
    }
}