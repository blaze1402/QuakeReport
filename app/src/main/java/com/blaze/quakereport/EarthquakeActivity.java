package com.blaze.quakereport;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquake = new ArrayList<Earthquake>();
        earthquake.add(new Earthquake("7.2", "San Francisco", "Mar 03, 2021"));
        earthquake.add(new Earthquake("8.1", "London", "Mar 02, 2021"));
        earthquake.add(new Earthquake("4.6", "Tokyo", "Mar 02, 2021"));
        earthquake.add(new Earthquake("7.5", "Mexico City", "Feb 27, 2021"));
        earthquake.add(new Earthquake("6.2", "Moscow", "Feb 23, 2021"));
        earthquake.add(new Earthquake("4.7", "Rio de Janeiro", "Feb 19, 2021"));
        earthquake.add(new Earthquake("5.9", "Paris", "Feb 14, 2021"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = findViewById(R.id.list);

        // Create a new adapter that takes list of earthquakes as input.
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquake);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}