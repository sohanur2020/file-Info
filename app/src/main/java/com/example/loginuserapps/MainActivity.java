package com.example.loginuserapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4,editText5,editText6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("From Print");

        editText1 = findViewById(R.id.editTextID1);
        editText2 = findViewById(R.id.editTextID2);
        editText3 = findViewById(R.id.editTextID3);
        editText4 = findViewById(R.id.editTextID4);
        editText5 = findViewById(R.id.editTextID5);
        editText6 = findViewById(R.id.editTextID6);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });

        findViewById(R.id.print).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str= editText1.getText().toString();
                String str1= editText2.getText().toString();
                String str2= editText3.getText().toString();
                String str3= editText4.getText().toString();
                String str4= editText5.getText().toString();
                String str5= editText6.getText().toString();

                if (str.length()==0){
                    editText1.setError("Insert value");
                    Toast.makeText(MainActivity.this, "Insert value", Toast.LENGTH_SHORT).show();
                    Log.e("Main","put some value");
                    return;

            }       else if(str1.length()==0){
                    editText2.setError("Insert value");
                    Toast.makeText(MainActivity.this, "Insert value", Toast.LENGTH_SHORT).show();
                    Log.e("Main","put some value");
                    return;

                }
                else if(str2.length()==0){
                    editText3.setError("Insert value");
                    Toast.makeText(MainActivity.this, "Insert value", Toast.LENGTH_SHORT).show();
                    Log.e("Main","put some value");
                    return;

                }
                else if(str3.length()==0){
                    editText4.setError("Insert value");
                    Toast.makeText(MainActivity.this, "Insert value", Toast.LENGTH_SHORT).show();
                    Log.e("Main","put some value");
                    return;
                }
                else if(str4.length()==0){
                    editText5.setError("Insert value");
                    Toast.makeText(MainActivity.this, "Insert value", Toast.LENGTH_SHORT).show();
                    Log.e("Main","put some value");
                    return;

                }
                else if(str5.length()==0){
                    editText6.setError("Insert value");
                    Toast.makeText(MainActivity.this,"Insert Value",Toast.LENGTH_SHORT).show();
                    Log.e("Main","Put some Value");
                    return;
                }
                try{
                    Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                   intent.putExtra("str_key1",str);
                   intent.putExtra("str_key2",str1);
                   intent.putExtra("str_key3",str2);
                   intent.putExtra("str_key4",str3);
                   intent.putExtra("str_key5",str4);
                   intent.putExtra("str_key6",str5);
                   startActivity(intent);
                }
                catch (ActivityNotFoundException e){
                    Log.e("Main", "Activity is not mention in Manifest " + e.getMessage());
                    Toast.makeText(MainActivity.this, "Check Manifaest", Toast.LENGTH_SHORT).show();
                }finally {

                }

            }
        });


    }
}
