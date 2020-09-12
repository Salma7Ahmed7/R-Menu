package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class TopLevelActivity extends AppCompatActivity {
ListView listOptionsTopLevelActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        listOptionsTopLevelActivity = findViewById(R.id.list_option);

        AdapterView.OnItemClickListener ItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           if (position== 0){
               Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
               startActivity(intent);
           }
            }
        };
        listOptionsTopLevelActivity.setOnItemClickListener(ItemClickListener);
    }
}