package com.example.user.login_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    EditText fullname,password,email,address,dob;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        fullname=(EditText)findViewById(R.id.fullname);
        password=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
        address=(EditText)findViewById(R.id.address);
        dob=(EditText)findViewById(R.id.dob);
        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),login.class);
                startActivity(intent);
                if(fullname.getText().toString().equals(""))
                {
                    fullname.setError("Enter valid name");
                }
                else  if(password.getText().toString().equals(""))
                {
                    password.setError("Enter valid password");
                }
                else  if(email.getText().toString().equals(""))
                {
                    email.setError("Enter valid email");
                }
                else  if(address.getText().toString().equals(""))
                {
                    address.setError("Enter valid address");
                }
                else  if(dob.getText().toString().equals(""))
                {
                    dob.setError("Enter valid dob");
                }
            }
        });
    }
}
