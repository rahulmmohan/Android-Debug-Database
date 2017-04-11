package com.overrideandroid.android_debug_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(this);
        db.addContact("Ravi", "9100000000");
        db.addContact("Srinivas", "9199999999");
        db.addContact("Tommy", "9522222222");
        db.addContact("Karthik", "9533333333");
    }
}
