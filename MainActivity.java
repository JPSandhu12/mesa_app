package com.packetpub.webview1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonMesa, buttonYahoo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMesa = (Button) findViewById(R.id.buttonMesa);
        buttonYahoo= (Button) findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(this);
        buttonMesa.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.buttonYahoo:
                intent = new Intent(this, Yahoo.class);
                startActivity(intent);
                break;
            case R.id.buttonMesa:
                intent = new Intent(this, Mesa.class);
                startActivity(intent);
                break;
        }
    }
}
