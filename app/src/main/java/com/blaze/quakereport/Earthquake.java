package com.blaze.quakereport;

/**
 * An {@link Earthquake} object contains information related to single earthquake.
 */
public class Earthquake {

    /**
     * Magnitude of the Earthquake
     */
    private final Double mMagnitude;

    /**
     * Location of the Earthquake
     */
    private final String mLocation;

    /**
     * Date of the Earthquake
     */
    private final long mTimeInMilliseconds;

    /**
     * Location of the Earthquake
     */
    private final String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude(size) of the earthquake.
     * @param location           is the location of the earthquake.
     * @param timeInMilliseconds is the date the earthquake happened.
     */
    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl =url;
    }

    /**
     * @return the magnitude of the earthquake.
     */
    public Double getMagnitude() {
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
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * @return the URL of the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}