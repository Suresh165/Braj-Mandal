package com.example.brajmandal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Mathura extends AppCompatActivity {
    private LinearLayout l_Janmabhoom,l_dwarkadhish,l_gita_mandir,l_Jaigurudev,l_kesava_deo,l_chamunda_devi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathura);

        l_Janmabhoom = findViewById(R.id.Janmabhoom);
        l_dwarkadhish = findViewById(R.id.dwarkadhish);
        l_gita_mandir = findViewById(R.id.gita_mandir);
        l_Jaigurudev = findViewById(R.id.Jaigurudev);
        l_kesava_deo = findViewById(R.id.kesava_deo);
        l_chamunda_devi = findViewById(R.id.chamunda_devi);

        l_Janmabhoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janmabhoom = new Intent(Mathura.this,Shri_Krishna_Janmabhoomi.class);
                Toast.makeText(Mathura.this, "Welcome to Shri_Krishna_Janmabhoomi", Toast.LENGTH_SHORT).show();
                startActivity(janmabhoom);
            }
        });

        l_dwarkadhish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janmabhoom = new Intent(Mathura.this,Dwarkadhish.class);
                Toast.makeText(Mathura.this, "Welcome to Dwarkadhish", Toast.LENGTH_SHORT).show();
                startActivity(janmabhoom);
            }
        });

        l_gita_mandir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janmabhoom = new Intent(Mathura.this,Gita_Mandir.class);
                Toast.makeText(Mathura.this, "Welcome to Gita_Mandir", Toast.LENGTH_SHORT).show();
                startActivity(janmabhoom);
            }
        });

        l_Jaigurudev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janmabhoom = new Intent(Mathura.this,Baba_Jaigurudev_Mandir.class);
                Toast.makeText(Mathura.this, "Welcome to Baba_Jaigurudev_Mandir", Toast.LENGTH_SHORT).show();
                startActivity(janmabhoom);
            }
        });

        l_kesava_deo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janmabhoom = new Intent(Mathura.this,Kesava_Deo_Temple.class);
                Toast.makeText(Mathura.this, "Welcome to Kesava_Deo_Temple", Toast.LENGTH_SHORT).show();
                startActivity(janmabhoom);
            }
        });

        l_chamunda_devi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janmabhoom = new Intent(Mathura.this,Chamunda_Devi_Temple.class);
                Toast.makeText(Mathura.this, "Welcome to Chamunda_Devi_Temple", Toast.LENGTH_SHORT).show();
                startActivity(janmabhoom);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent intent = new Intent(Mathura.this,MainActivity.class);
                Toast.makeText(this, "Welcome to Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}