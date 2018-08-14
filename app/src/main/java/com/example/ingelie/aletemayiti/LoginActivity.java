package com.example.ingelie.aletemayiti;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnKonekte;
    EditText etUserName, etPaskod;
    TextView tvForget, tvRegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName = (EditText) findViewById(R.id.etUserName);
        etPaskod = (EditText) findViewById(R.id.etKonfPaskod);
        btnKonekte = (Button) findViewById(R.id.btnKonekte);
        tvRegisterLink = (TextView)findViewById(R.id.tvRegisterLink);

        btnKonekte.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnKonekte:
                break;

            case R.id.tvRegisterLink:
                startActivity(new Intent(this,RegisterActivity.class));
                break;
        }
    }
}
