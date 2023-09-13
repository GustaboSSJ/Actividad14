package com.example.actividad14;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText editText;
    private RatingBar ratingBar;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Inicializar vistas
        editText = findViewById(R.id.editTextText1);
        ratingBar = findViewById(R.id.ratingBar1);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        textView = findViewById(R.id.textView);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                if (fromUser) {

                    Toast.makeText(getApplicationContext(), "Gracias por su valoración", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}