package id.ac.poliban.mi.cahyo.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nama = findViewById(R.id.etNama);
        Button tampilkan = findViewById(R.id.btTampilkan);

        tampilkan.setOnClickListener(v -> {

        Toast.makeText(this, "Selamat Datang " + nama.getText(), Toast.LENGTH_SHORT).show();
        });

    }
}
