package com.example.tejashree.womensafetyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Intent intent;
//    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
       submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
*/


    }
    public void submit(View view)
    {
        Toast.makeText(this, "Registered Successfully", Toast.LENGTH_LONG).show();
        intent =new Intent(getApplicationContext(),list_of_emergency.class);
        startActivity(intent);
    }
}
