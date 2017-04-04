package com.example.android.miwok;

/**
 * Created by rahulkapoor on 04/04/17.
 */

public class FamilyData {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mfamilymember;
    private int mImageId = NO_IMAGE_PROVIDED;

    /**
     *
     * @param member member name in family
     * @param imageid image of family member
     */
    public FamilyData(final String member, final int imageid) {

        this.mfamilymember = member;
        this.mImageId = imageid;

    }

    /**
     *
     * @return family memeber name;
     */
    public String getFamilyMember() {
        return mfamilymember;
    }

    /**
     *
     * @return family member image id
     */
    public int getImageID() {
        return mImageId;
    }

    /**
     *
     * @return check for presence of image of that family member;
     */
    public boolean hasImage() {
        return true;
    }


}
