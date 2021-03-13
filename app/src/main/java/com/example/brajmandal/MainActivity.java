package com.example.brajmandal;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    private LinearLayout L_mathura,L_vrindawan,L_barsana,L_nandgaon,L_gokul,L_jateepura,L_KAMYAVANA,L_Madan_Mohan,L_Gopinathji,L_Nand_Bhavan,
            L_Kameshwar_Mahadev,L_Dharma_Kund,L_Yashoda_Kund;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        L_mathura =  findViewById(R.id.mathura);
        L_vrindawan =  findViewById(R.id.vrindawan);
        L_barsana =  findViewById(R.id.barsana);
        L_nandgaon =  findViewById(R.id.nandgaon);
        L_gokul =  findViewById(R.id.gokul);
        L_jateepura =  findViewById(R.id.Jateepura);
        L_KAMYAVANA =  findViewById(R.id.KAMYAVANA);
        L_Madan_Mohan =  findViewById(R.id.Madan_Mohan);
        L_Gopinathji =  findViewById(R.id.Gopinathji);
        L_Nand_Bhavan =  findViewById(R.id.Nand_Bhavan);
        L_Kameshwar_Mahadev =  findViewById(R.id.Kameshwar_Mahadev);
        L_Dharma_Kund =  findViewById(R.id.Dharma_Kund);
        L_Yashoda_Kund =  findViewById(R.id.Yashoda_Kund);

        L_mathura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Mathura.class);
                Toast.makeText(MainActivity.this, "Welcome to Mathura", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
                finish();
            }
        });

        L_vrindawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Vrindavan.class);
                Toast.makeText(MainActivity.this, "Welcome to Vrindavan", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_barsana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Barsana.class);
                Toast.makeText(MainActivity.this, "Welcome to Barsana", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_nandgaon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Nandgaon.class);
                Toast.makeText(MainActivity.this, "Welcome to Nandgaon", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_gokul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Gokul.class);
                Toast.makeText(MainActivity.this, "Welcome to Gokul", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_jateepura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent mathura = new Intent(MainActivity.this,Jateepura.class);
                Toast.makeText(MainActivity.this, "Welcome to Jateepura", Toast.LENGTH_SHORT).show();
                  startActivity(mathura);
            }
        });


        L_KAMYAVANA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,kamyavan.class);
                Toast.makeText(MainActivity.this, "Welcome to Kamyavana", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_Madan_Mohan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Madan_Mohan.class);
                Toast.makeText(MainActivity.this, "Welcome to Madan Mohan", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_Gopinathji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Gopinathji.class);
                Toast.makeText(MainActivity.this, "Welcome to Gopinathji", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_Nand_Bhavan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Nand_Bhavan.class);
                Toast.makeText(MainActivity.this, "Welcome to Nand_Bhavan", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_Kameshwar_Mahadev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent mathura = new Intent(MainActivity.this,Kameshwar.class);
                Toast.makeText(MainActivity.this, "Welcome to Kameshwar", Toast.LENGTH_SHORT).show();
                  startActivity(mathura);
            }
        });

        L_Dharma_Kund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dharma_kund = new Intent(MainActivity.this,Dharma_Kund.class);
                Toast.makeText(MainActivity.this, "Welcome to Dharma kund", Toast.LENGTH_SHORT).show();
                startActivity(Dharma_kund);
                finish();
            }
        });

        L_Yashoda_Kund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dharma_kund = new Intent(MainActivity.this,Yashoda_Kund.class);
                Toast.makeText(MainActivity.this, "Welcome to  Yashoda_Kund", Toast.LENGTH_SHORT).show();
                startActivity(Dharma_kund);
                finish();
            }
        });


        L_Dharma_Kund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dharma_kund = new Intent(MainActivity.this,Dharma_Kund.class);
                Toast.makeText(MainActivity.this, "Welcome to Dharma kund", Toast.LENGTH_SHORT).show();
                startActivity(Dharma_kund);
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
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                Toast.makeText(this, "Welcome to Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}