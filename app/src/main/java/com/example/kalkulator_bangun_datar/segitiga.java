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

public class segitiga extends AppCompatActivity {
    EditText inputAlas, inputTinggi, hasilLuas;
    Button  btnHasilLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segitiga);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        inputAlas = findViewById(R.id.alas);
        inputTinggi = findViewById(R.id.tinggi);
        hasilLuas = findViewById(R.id.hasil);
        btnHasilLuas = findViewById(R.id.btnHasilLuas);

        btnHasilLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });
    }
    private void hitungLuasSegitiga(){
        String strAlas  = inputAlas.getText().toString();
        String strTinggi  = inputTinggi.getText().toString();
        if (!strAlas.isEmpty() && !strTinggi.isEmpty()) {
            double alas = Double.parseDouble(strAlas);
            double tinggi = Double.parseDouble(strTinggi);
            double luas = 0.5*alas*tinggi;
            hasilLuas.setText("Luas : "+luas);
        }
        else {
            hasilLuas.setText("Masukan Panjang dan Lebar terlebih dahulu");
        }
    }
}