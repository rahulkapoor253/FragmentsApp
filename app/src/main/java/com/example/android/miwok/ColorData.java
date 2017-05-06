package com.example.android.miwok;

/**
 * Created by rahulkapoor on 10/04/17.
 */

public class ColorData {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mcolor;
    private int mImageId = NO_IMAGE_PROVIDED;

    /**
     * @param color   member name in family
     * @param imageid image of family member
     */
    public ColorData(final String color, final int imageid) {
        this.mcolor = color;
        this.mImageId = imageid;

    }

    /**
     * @return family memeber name;
     */
    public String getColor() {
        return mcolor;
    }

    /**
     * @return family member image id
     */
    public int getImageID() {
        return mImageId;
    }

    /**
     * @return check for presence of image of that family member;
     */
    public boolean hasImage() {
        return true;
    }


}
