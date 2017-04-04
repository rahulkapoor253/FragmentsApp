package com.example.android.miwok;

/**
 * this class holds the data variables and methods;
 */

public class Numberdata {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String menglish;
    private String mnumber;

    private int mImageId = NO_IMAGE_PROVIDED;


    /**
     *
     * @param eng sets value to class variable
     * @param numeric sets value to class variable
     * @param imageid sets value to class variable
     */

    public Numberdata(final String eng, final String numeric, final int imageid) {
        this.menglish = eng;
        this.mnumber = numeric;
        this.mImageId = imageid;

    }


    /**
     *
     * @return returns english words;
     */

    public String getEnglish() {
        return menglish;

    }

    /**
     *
     * @return returns numbers to it;
     */
    public String getNumber() {
        return mnumber;

    }

    /**
     *
     * @return returns images;
     */

    public int getImageId() {
        return mImageId;
    }

    /**
     *
     * @return checks for image presence;
     */
    public boolean hasImage() {
        return true;
    }


}
