package com.example.actividad14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        Button btn1 = findViewById(R.id.btn1);
        Button btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar la ProgressBar
                progressBar.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Ocultar la ProgressBar después de que se complete la tarea
                        progressBar.setVisibility(View.INVISIBLE);

                        // Luego, inicia la actividad correspondiente
                        Intent intent = new Intent(MainActivity.this, activity_vista_constraint.class);
                        startActivity(intent);
                    }
                }, 2000); // Simula un retraso de 2 segundos
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar la ProgressBar
                progressBar.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Ocultar la ProgressBar después de que se complete la tarea
                        progressBar.setVisibility(View.INVISIBLE);

                        // Luego, inicia la actividad Containers
                        Intent intent = new Intent(MainActivity.this, Conteiners.class);
                        startActivity(intent);
                    }
                }, 2000); // Simula un retraso de 2 segundos
            }
        });
    }
}


