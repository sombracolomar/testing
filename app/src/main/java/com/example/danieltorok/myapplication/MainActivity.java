package com.example.danieltorok.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button navigateToAnOtherScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        navigateToAnOtherScreen = (Button) findViewById(R.id.gombid);

        navigateToAnOtherScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view)  {

                return navigacioMasodikScreenre();
            }
        });
    }

    private void navigacioMasodikScreenre()  {
        Intent navigaciointent = new Intent(this, MasodikActivity.class);
        startActivity(navigaciointent);

    }




}


