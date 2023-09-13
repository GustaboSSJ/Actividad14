package com.example.actividad14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Conteiners extends AppCompatActivity {

    private Spinner spinner;
    private RecyclerView recyclerView;
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conteiners);

        // Inicializa la instancia del Spinner
        spinner = findViewById(R.id.spinner1);

        // Array para el spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String seleccion = parent.getItemAtPosition(position).toString();
                if (seleccion.equals("Alumnos")) {
                    // Configurar la imagen en el ImageView para "Alumnos" (pikachu)
                    ImageView imageView = findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.pikachu);
                } else if (seleccion.equals("Profesor")) {
                    // Configurar la imagen en el ImageView para "Profesor" (lucario)
                    ImageView imageView = findViewById(R.id.imageView1);
                    imageView.setImageResource(R.drawable.lucario);
                } else if (seleccion.equals("Invitado")) {
                    // Mostrar un Toast para "Invitado"
                    Toast.makeText(getApplicationContext(), "Hola invitado", Toast.LENGTH_SHORT).show();
                }

                cardView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(getApplicationContext(), "Seleccione una opción", Toast.LENGTH_SHORT).show();
            }
        });
        
        cardView = findViewById(R.id.cardView); // Reemplaza "cardView" con el ID correcto

    }
}
