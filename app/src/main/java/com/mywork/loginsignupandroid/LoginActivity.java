package com.mywork.loginsignupandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtPin;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtPin =(EditText)findViewById(R.id.editTextPin);
        btnLogin =(Button)findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pin= edtPin.getText().toString();
                if(pin.equals("4444")){
                    Toast.makeText(getApplicationContext(),"Login Success!!",Toast.LENGTH_LONG).show();
                }else {

                    Intent i=new Intent(LoginActivity.this,SignUpActivity.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"Login Failed!!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
