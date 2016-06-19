package com.hello.btimalsina.listview.module;

/**
 * Created by btimalsina on 6/19/2016.
 */
public class Rank {
    private String countryName;
    private int rank;

    public Rank(String c, int r) {
        this.countryName = c;
        this.rank = r;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


}
