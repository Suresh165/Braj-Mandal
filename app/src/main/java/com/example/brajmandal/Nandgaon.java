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

public class Nandgaon extends AppCompatActivity {
    private LinearLayout l_Nandbaba,l_pavana_sarovara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandgaon);

        l_Nandbaba = findViewById(R.id.Nandbaba);
        l_pavana_sarovara = findViewById(R.id.pavana_sarovara);

        l_Nandbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nandgaon.this,Nandbaba.class);
                Toast.makeText(Nandgaon.this, "Welcome to Nandbaba", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });

        l_pavana_sarovara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent(Nandgaon.this,pavana_sarovara.class);
                Toast.makeText(Nandgaon.this, "Welcome to pavana_sarovara", Toast.LENGTH_SHORT).show();
                startActivity(intent_1);
                finish();
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
                Intent intent = new Intent(Nandgaon.this,MainActivity.class);
                Toast.makeText(this, "Welcome to Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}