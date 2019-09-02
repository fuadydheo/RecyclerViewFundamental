package com.example.dheo.SubmissionRecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// TODO 4.0 Kemudian kita modifikasi berkas kelas MainActivity kita inisiasikan RecyclerView yang sudah dibuat di activity_main.
// TODO 4.1 Selanjutnya setelah diinisiasikan, kita akan panggil data yang sudah kita buat di kelas AnimasData.


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnimals;
    private ArrayList<Animal> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimals = findViewById(R.id.rv_animal);
        rvAnimals.setHasFixedSize(true);

        list.addAll(AnimalsData.getListData());
        showRecyclerList();
     }

    private void showRecyclerList(){
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listAnimalAdapter = new ListAnimalAdapter(list, getApplicationContext());
        rvAnimals.setAdapter(listAnimalAdapter);
     }

     //TODO 4.2 Setelah selesai, saatnya kita pasang menu tersebut di MainActivity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
        }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
        }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_favorite:
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                break;

            }
        }
    //TODO 4.2 berakhir disini
    }

