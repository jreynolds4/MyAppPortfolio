package com.jon.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void displayPopularMovies(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Wanna check out Popular Movies?";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button */
    public void displayStockHawk(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Here's the Stock Hawk project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();    }

    /** Called when the user touches the button */
    public void displayBuildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Here's the Build It Bigger project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();    }

    /** Called when the user touches the button */
    public void displayMakeYourAppMaterial(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Here's the Make your Own App Material project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();    }

    /** Called when the user touches the button */
    public void displayGoUbiquitous(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Here's the Go Ubiquitous project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();    }

    /** Called when the user touches the button */
    public void displayCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This is where my app will go!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();    }
}
