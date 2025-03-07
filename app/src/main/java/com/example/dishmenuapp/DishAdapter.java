package com.example.dishmenuapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {
    // Список блюд
    List<Dish> dishList;
    // Конструктор
    public DishAdapter(List<Dish> dishList) {
        this.dishList = dishList;
    }
    // Создание ViewHolder для каждого элемента списка
    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dish, parent, false);
        return new DishViewHolder(view);
    }
    // Привязка данных к ViewHolder
    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        // Получение блюда по позиции
        Dish dish = dishList.get(position);
        holder.dishImage.setImageResource(dish.getImageResId());
        holder.dishName.setText(dish.getName());
        holder.dishTime.setText("Time: " + dish.getTime());
    }
    // Возвращает количество элементов в списке
    @Override
    public int getItemCount() {
        return dishList.size();
    }
    // Класс который хранит информацию о ViewHolder
    public static class DishViewHolder extends RecyclerView.ViewHolder {
        ImageView dishImage;
        TextView dishName;
        TextView dishTime;
        // Конструктор, принимает макет элемента списка, находит в нем элементы и сохраняет
        public DishViewHolder(@NonNull View itemView) {
            super(itemView);
            dishImage = itemView.findViewById(R.id.dishImage);
            dishName = itemView.findViewById(R.id.dishName);
            dishTime = itemView.findViewById(R.id.dishTime);
        }
    }
}