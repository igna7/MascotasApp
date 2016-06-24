package com.ignacioruben7.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;

    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaDeMascotas();
        inicializarAdaptador();

    }

    public MascotaAdapter adapter;
    private void inicializarAdaptador(){
        adapter = new MascotaAdapter(mascotas, this);
        listaMascotas.setAdapter(adapter);
    }

    public void iniciarFavoritos(View view){
        Intent intent = new Intent(this,ListadoMascotas.class);
        startActivity(intent);
    }

    public void inicializarListaDeMascotas(){
        mascotas = new ArrayList <Mascota>();

        mascotas.add(new Mascota("Arturito",R.drawable.mascota1,"5"));
        mascotas.add(new Mascota("Firulais",R.drawable.mascota2,"4"));
        mascotas.add(new Mascota("Shakiro",R.drawable.mascota3,"2"));
        mascotas.add(new Mascota("Snoopy",R.drawable.mascota4,"4"));
        mascotas.add(new Mascota("Ojitos",R.drawable.mascota5,"3"));
        mascotas.add(new Mascota("Alex",R.drawable.mascota6,"4"));
        mascotas.add(new Mascota("Miky",R.drawable.mascota7,"5"));
        mascotas.add(new Mascota("Flash",R.drawable.mascota8,"4"));
        mascotas.add(new Mascota("Terminator",R.drawable.mascota9,"3"));

    }
}
