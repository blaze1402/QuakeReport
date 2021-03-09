package com.blaze.quakereport;

/**
 * An {@link Earthquake} object contains information related to single earthquake.
 */
public class Earthquake {

    /**
     * Magnitude of the Earthquake
     */
    private final String mMagnitude;

    /**
     * Location of the Earthquake
     */
    private final String mLocation;

    /**
     * Date of the Earthquake
     */
    private final String mDate;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude(size) of the earthquake.
     * @param location  is the location of the earthquake.
     * @param date      is the date the earthquake happened.
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * @return the magnitude of the earthquake.
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return the date of the earthquake.
     */
    public String getDate() {
        return mDate;
    }
}