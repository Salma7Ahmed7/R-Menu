package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class DrinkActivity extends AppCompatActivity {
    public static final String EXTRA_DRINKID = "drinkid";
    int drinkID;
    //int drinkID = (int)getIntent().getExtras().getInt(EXTRA_DRINKID);
    TextView description, name;
    ImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            drinkID = extras.getInt(EXTRA_DRINKID);
        }
        setContentView(R.layout.activity_drink);
        Drink drink = Drink.drinks[drinkID];
        name = findViewById(R.id.name);
        name.setText(drink.getName());

        description = findViewById(R.id.description);
        description.setText(drink.getDescription());

        photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResources());
        photo.setContentDescription(drink.getName());
    }
}