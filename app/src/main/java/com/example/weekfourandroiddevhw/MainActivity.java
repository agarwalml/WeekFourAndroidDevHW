package com.example.weekfourandroiddevhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setTitle("Spongebook");
        ImageView Spongebob = (ImageView) findViewById(R.id.Profile);
        TextView Username = (TextView) findViewById(R.id.Username);
        TextView Password = (TextView) findViewById(R.id.Password);
        EditText UserInput = (EditText) findViewById(R.id.UserID);
        EditText PassInput = (EditText) findViewById(R.id.PassID);
        final Button login = findViewById(R.id.Login);
        final Button signup = findViewById(R.id.SignUp);

    }
}
