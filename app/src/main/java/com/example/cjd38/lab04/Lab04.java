package com.example.cjd38.lab04;
/*
 * Lab 4 for cs 262
 *
 * @author: Cameron Dewey
 * @
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.MenuItem;

public class Lab04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab04);
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
