package com.example.brajmandal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Vrindavan extends AppCompatActivity {

    private LinearLayout l_banke_bihari_mandir,l_prem_mandir_vrindavan,l_nidhivan_temple,l_shri_rangji,l_shri_krishna_balaram,l_gopi_nath,l_shri_radhavallabh,
            l_priyakant_ji,l_govind_devji,l_Shahji,l_Radharamana,l_Madan_Mohan,l_Jaipur_Temple,l_Jugal_Kishore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrindavan);

        l_banke_bihari_mandir = findViewById(R.id.banke_bihari_mandir);
        l_prem_mandir_vrindavan = findViewById(R.id.prem_mandir_vrindavan);
        l_nidhivan_temple = findViewById(R.id.nidhivan_temple);
        l_shri_rangji = findViewById(R.id.shri_rangji);
        l_shri_krishna_balaram = findViewById(R.id.shri_krishna_balaram);
        l_gopi_nath = findViewById(R.id.gopi_nath);
        l_shri_radhavallabh = findViewById(R.id.Shri_Radha_Vallabh);
        l_priyakant_ji = findViewById(R.id.Priyakant_Ji);
        l_govind_devji = findViewById(R.id.Govind_Devji);
        l_Shahji = findViewById(R.id.Shahji);
        l_Radharamana = findViewById(R.id.Radharamana);
        l_Madan_Mohan = findViewById(R.id.Madan_Mohan);
        l_Jaipur_Temple = findViewById(R.id.Jaipur_Temple);
        l_Jugal_Kishore = findViewById(R.id.Jugal_Kishore);
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
                Intent intent = new Intent(Vrindavan.this,MainActivity.class);
                Toast.makeText(this, "Welcome to Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}