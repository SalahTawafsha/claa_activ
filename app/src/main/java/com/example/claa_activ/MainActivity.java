package com.example.claa_activ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText userName;
    private Spinner department;
    private Button add;
    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        add.setOnClickListener(e -> {
            String s = userName.getText() + "\n" + department.getSelectedItem();         // by default it selected so don't need check
            if (switch1.isChecked())
                Toast.makeText(getApplicationContext(), s + "\n" + switch1.getText(), Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
        });
    }

    private void initialize() {
        userName = findViewById(R.id.userName);
        department = findViewById(R.id.department);
        add = findViewById(R.id.add);
        switch1 = findViewById(R.id.switch1);
    }
}