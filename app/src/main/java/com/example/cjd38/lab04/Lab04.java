package com.example.cjd38.lab04;
/*
 * Lab 5 for cs 262
 *
 * @author: Cameron Dewey
 * @version 1 10-27-2016
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;

public class Lab04 extends AppCompatActivity {

    public static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab05);
        textView = (TextView) findViewById(R.id.textView);
    }

    //makes the menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.harambemenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent(Lab04.this, harambeIsBae.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
