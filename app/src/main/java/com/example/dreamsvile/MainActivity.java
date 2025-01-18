package com.example.dreamsvile;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void submitButton (View v) {
        EditText firstNameEdit = findViewById(R.id.firstName);
        EditText lastNameEdit = findViewById(R.id.lastName);
        EditText email = findViewById(R.id.email);

        TextView firstNameText = findViewById(R.id.firstNameText);
        TextView lastNameText = findViewById(R.id.lastNameText);
        TextView emailText = findViewById(R.id.emailText);

        firstNameText.setText(firstNameEdit.getText().toString());
        lastNameText.setText(lastNameEdit.getText().toString());
        emailText.setText(email.getText().toString());

    }


}