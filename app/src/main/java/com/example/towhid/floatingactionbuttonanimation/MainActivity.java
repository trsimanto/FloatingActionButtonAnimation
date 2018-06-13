package com.example.towhid.floatingactionbuttonanimation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab,fab1,fab2,fab3,fab4,fab5,fab6,fab7,fab8;
    Animation fab1Open,fab1Close,fab2Open,fab2Close,fab3Open,fab3Close,fab4Open,fab4Close,fab5Open,fab5Close,fab6Open,fab6Close,fab7Open,fab7Close,fab8Open,fab8Close,rotateForward,rotateBackward;
    boolean isOpen=false;
    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        fab4 = (FloatingActionButton) findViewById(R.id.fab4);
        fab5 = (FloatingActionButton) findViewById(R.id.fab5);
        fab6 = (FloatingActionButton) findViewById(R.id.fab6);
        fab7 = (FloatingActionButton) findViewById(R.id.fab7);
        fab8 = (FloatingActionButton) findViewById(R.id.fab8);


        fab1Open= AnimationUtils.loadAnimation(this,R.anim.fab1_open);
        fab1Close= AnimationUtils.loadAnimation(this,R.anim.fab1_close);

        fab2Open= AnimationUtils.loadAnimation(this,R.anim.fab2_open);
        fab2Close= AnimationUtils.loadAnimation(this,R.anim.fab2_close);

        fab3Open= AnimationUtils.loadAnimation(this,R.anim.fab3_open);
        fab3Close= AnimationUtils.loadAnimation(this,R.anim.fab3_close);

        fab4Open= AnimationUtils.loadAnimation(this,R.anim.fab4_open);
        fab4Close= AnimationUtils.loadAnimation(this,R.anim.fab4_close);

        fab5Open= AnimationUtils.loadAnimation(this,R.anim.fab5_open);
        fab5Close= AnimationUtils.loadAnimation(this,R.anim.fab5_close);

        fab6Open= AnimationUtils.loadAnimation(this,R.anim.fab6_open);
        fab6Close= AnimationUtils.loadAnimation(this,R.anim.fab6_close);

        fab7Open= AnimationUtils.loadAnimation(this,R.anim.fab7_open);
        fab7Close= AnimationUtils.loadAnimation(this,R.anim.fab7_close);

        fab8Open= AnimationUtils.loadAnimation(this,R.anim.fab8_open);
        fab8Close= AnimationUtils.loadAnimation(this,R.anim.fab8_close);

        rotateForward= AnimationUtils.loadAnimation(this,R.anim.rotate_forward);
        rotateBackward= AnimationUtils.loadAnimation(this,R.anim.rotate_backward);






        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animateFab();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
                Toast.makeText(MainActivity.this, "fab 1 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
                Toast.makeText(MainActivity.this, "fab 2 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
                Toast.makeText(MainActivity.this, "fab 3 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
                Toast.makeText(MainActivity.this, "fab 4 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
                Toast.makeText(MainActivity.this, "fab 5 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
                Toast.makeText(MainActivity.this, "fab 6 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
                Toast.makeText(MainActivity.this, "fab 7 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
                Toast.makeText(MainActivity.this, "fab 8 clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void animateFab()
    {
        if (isOpen)
        {
            fab.startAnimation(rotateBackward);
            fab1.startAnimation(fab1Close);
            fab2.startAnimation(fab2Close);
            fab3.startAnimation(fab3Close);
            fab4.startAnimation(fab4Close);
            fab5.startAnimation(fab5Close);
            fab6.startAnimation(fab6Close);
            fab7.startAnimation(fab7Close);
            fab8.startAnimation(fab8Close);

            fab1.setClickable(false);
            fab2.setClickable(false);
            fab3.setClickable(false);
            fab4.setClickable(false);
            fab5.setClickable(false);
            fab6.setClickable(false);
            fab7.setClickable(false);
            fab8.setClickable(false);

            isOpen=false;
        }
        else {
            fab.startAnimation(rotateForward);
            fab1.startAnimation(fab1Open);
            fab2.startAnimation(fab2Open);
            fab3.startAnimation(fab3Open);
            fab4.startAnimation(fab4Open);
            fab5.startAnimation(fab5Open);
            fab6.startAnimation(fab6Open);
            fab7.startAnimation(fab7Open);
            fab8.startAnimation(fab8Open);

            fab1.setClickable(true);
            fab2.setClickable(true);
            fab3.setClickable(true);
            fab4.setClickable(true);
            fab5.setClickable(true);
            fab6.setClickable(true);
            fab7.setClickable(true);
            fab8.setClickable(true);

            isOpen=true;
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
