package com.geniusvjr.nbaer.event;

import com.geniusvjr.nbaer.data.Constant;

/**
 * Created by dream on 16/5/21.
 */
public class StatEvent extends Event{

    private String mStatKind;
    private String[][] mLables;
    private String[][] mPlayerUrls;
    private float[][] mStatValues;
    private Constant.GETNEWSWAY getNewsWay;

    public StatEvent (String statKind,String[][] lables,float[][] statValues,String[][] playerUrls) {
        this.mStatKind=statKind;
        this.mLables=lables;
        this.mStatValues=statValues;
        this.mPlayerUrls=playerUrls;
    }

    public Constant.GETNEWSWAY getGetNewsWay() {
        return getNewsWay;
    }

    public void setGetNewsWay(Constant.GETNEWSWAY getNewsWay) {
        this.getNewsWay = getNewsWay;
    }

    public String getStatKind() {
        return mStatKind;
    }

    public String[][] getLables() {
        return mLables;
    }

    public float[][] getStatValues() {
        return mStatValues;
    }

    public String[][] getPlayerUrls() {
        return mPlayerUrls;
    }
}
