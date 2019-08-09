package org.webpki.androidpay;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        for (String s : extras.keySet()) {
            Log.i("KKK", s);
        }

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result = new Intent();
                Bundle extras = new Bundle();
                extras.putString("methodName", "https://192.168.1.79:8442/w3cpay/method");
                extras.putString("details", "{\"big\": \"awesome\"}");
                result.putExtras(extras);
                setResult(RESULT_OK, result); // Change to RESULT_CANCELED on failure.
                finish();
            }
        });
    }

}
