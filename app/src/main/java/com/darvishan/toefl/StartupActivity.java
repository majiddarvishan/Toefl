package com.darvishan.toefl;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class StartupActivity extends Activity {


    Button sendButton;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);


        sendButton = (Button) findViewById(R.id.sendBtn);
        editText = (EditText) findViewById(R.id.editText);

        View.OnClickListener newListener0 = new ghazafar();

        View.OnClickListener newListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long currentTime = System.currentTimeMillis();
                editText.setText(currentTime + "");

            }
        };


        //sendButton.setOnClickListener(newListener);

        sendButton.setOnClickListener(newListener0);
    }


    class ghazafar implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            long currentTime = System.currentTimeMillis();
            editText.setText(currentTime + "****");
        }
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_startup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/
}
