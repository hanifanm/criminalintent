package com.hanifanm.gunung.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by hanifan on 6/13/2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
        mTitle = "Crime #" + mId.toString();
        mSolved = false;
    }

    public Boolean getmSolved() {
        return mSolved;
    }

    public void setSolved(Boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Boolean isSolved(){
        return mSolved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }


}
