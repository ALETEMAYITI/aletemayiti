package com.example.ingelie.aletemayiti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAnrejistre;
    EditText etNom, etNonjwet, etPaskond, etKonfPaskod, etImel;
    RadioGroup rgSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNom = (EditText) findViewById(R.id.etNom);
        etNonjwet = (EditText) findViewById(R.id.etSurnom);
        etPaskond = (EditText) findViewById(R.id.etPaskod);
        etKonfPaskod = (EditText) findViewById(R.id.etKonfPaskod);
        etImel = (EditText) findViewById(R.id.etImel);
        rgSex = (RadioGroup) findViewById(R.id.rgSex);

        btnAnrejistre = (Button)findViewById(R.id.btnAnrejistre);

        btnAnrejistre.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnAnrejistre:
                break;
        }
    }
}
