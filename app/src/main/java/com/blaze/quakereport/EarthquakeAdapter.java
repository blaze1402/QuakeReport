package com.blaze.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * An {@link EarthquakeAdapter} knows how to create a list item layout of each earthquake
 * in the data source (a link {@link Earthquake} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like a listView
 * to be displayed to the user.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Constructs a new {@link EarthquakeAdapter}.
     *
     * @param context    of the app.
     * @param earthquake is the list of Earthquake, which is the data source of the adapter.
     */
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquake) {
        super(context, 0, earthquake);
    }

    /**
     * @return a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checks if there is a existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes.
        Earthquake currentPosition = getItem(position);

        // Find the TextView with View ID magnitude.
        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of the Current earthquake in that TextView.
        magnitude.setText(currentPosition.getMagnitude());

        // Find the TextView with View ID location.
        TextView place = listItemView.findViewById(R.id.location);
        //Display the location of the Current earthquake in that TextView.
        place.setText(currentPosition.getLocation());

        // Find the TextView with View ID date.
        TextView date = listItemView.findViewById(R.id.date);
        //Display the date of the Current earthquake in that TextView.
        date.setText(currentPosition.getDate());

        // Return the list item view that is now showing the appropriate data.
        return listItemView;
    }
}
