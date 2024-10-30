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

public class persegi_panjang extends AppCompatActivity {

    EditText inputPanjang, inputLebar, hasil;
    Button btnHasilLuas, btnHasilKeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi_panjang);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputPanjang = findViewById(R.id.Panjang);
        inputLebar = findViewById(R.id.Lebar);
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
        String panjangStr = inputPanjang.getText().toString();
        String lebarStr = inputLebar.getText().toString();
        if (!panjangStr.isEmpty() && !lebarStr.isEmpty()) {
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double luas = panjang*lebar;
            hasil.setText("Luas : "+luas);
        }
        else {
            hasil.setText("Masukan Panjang dan Lebar terlebih dahulu");
        }
    }

    private void hitungKeliling(){
        String panjangStr = inputPanjang.getText().toString();
        String lebarStr = inputLebar.getText().toString();
        if (!panjangStr.isEmpty() && !lebarStr.isEmpty()) {
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double keliling = 2*(panjang+lebar);
            hasil.setText("Keliling : "+keliling);
        }
        else {
            hasil.setText("Masukan Panjang dan Lebar terlebih dahulu");
        }
    }

}