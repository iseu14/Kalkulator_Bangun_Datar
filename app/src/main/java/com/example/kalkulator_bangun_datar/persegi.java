package com.example.kalkulator_bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class persegi extends AppCompatActivity {

    EditText inputSisi, hasil;
    Button btnHasilLuas, btnHasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputSisi = findViewById(R.id.sisi);
        hasil = findViewById(R.id.hasil);
        btnHasilLuas = findViewById(R.id.btnHasilLuas);
        btnHasilKeliling = findViewById(R.id.btnHasilKeliling);

        btnHasilLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });

        btnHasilKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKeliling();
            }
        });

    }
    private void hitungLuas(){
        String Lsisi = inputSisi.getText().toString();
        if (!Lsisi.isEmpty()){
            double sisi = Double.parseDouble(Lsisi);
            double luas = sisi*sisi;
            hasil.setText("Luas : "+luas);
        }
        else {
            hasil.setText("Masukkan nilai sisi terlebih dahulu.");
        }
    }

    private void hitungKeliling(){
        String Ksisi = inputSisi.getText().toString();
        if (!Ksisi.isEmpty()){
            double sisi = Double.parseDouble(Ksisi);
            double keliling = 4*sisi;
            hasil.setText("keliling : "+keliling);
        }
        else {
            hasil.setText("Masukkan nilai sisi terlebih dahulu.");
        }
    }

}