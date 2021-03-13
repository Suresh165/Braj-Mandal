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

public class Gokul extends AppCompatActivity {

    private LinearLayout l_shri_thakur_rani_ghat,l_nand_bhavan,l_raman_reti,l_gokulnathji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gokul);

        l_shri_thakur_rani_ghat = findViewById(R.id.shri_thakur_rani_ghat);
        l_nand_bhavan = findViewById(R.id.nand_bhavan);
        l_raman_reti = findViewById(R.id.raman_reti);
        l_gokulnathji = findViewById(R.id.gokulnathji);

        l_shri_thakur_rani_ghat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gokul.this,shri_thakur_rani.class);
                startActivity(intent);
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
                Intent intent = new Intent(Gokul.this,MainActivity.class);
                Toast.makeText(this, "Welcome to Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}