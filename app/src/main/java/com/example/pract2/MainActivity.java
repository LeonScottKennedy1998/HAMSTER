package com.example.pract2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Hamster> hamsters = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HamsterAdapter adapter = new HamsterAdapter(this,hamsters);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        hamsters.add(new Hamster("Роблоксный Хомяк","Это мой скин из Роблокса", R.drawable.hom));
        hamsters.add(new Hamster("Жвачный хомяк","Он жуёт любимую жвачку, жвачку, жвачкууууу", R.drawable.homjvachka));
        hamsters.add(new Hamster("Грустный хомяк","Сегодня он немножечко грустит", R.drawable.pkajhom));
        hamsters.add(new Hamster("Тихий хомяк","10 часов тишины с хомяком", R.drawable.pyalhom));
        hamsters.add(new Hamster("Криминальный хомяк","ХАМСТЕР ХАМСТЕР ХАМСТЕР КРИМИНАЛ", R.drawable.krimhom));

    }

}