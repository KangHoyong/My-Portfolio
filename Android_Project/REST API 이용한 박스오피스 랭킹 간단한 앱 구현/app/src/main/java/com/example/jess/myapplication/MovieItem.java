package com.example.jess.myapplication;

public class MovieItem {

    private int rank;
    private String movieNm;
    private String openDt;
    private long salesAmt;


    public MovieItem(int rank, String movieNm, String openDt, long salesAmt)
    {
        this.rank = rank;
        this.movieNm = movieNm;
        this.openDt = openDt;
        this.salesAmt = salesAmt;
    }

    public int getRank()
    {
        return rank;
    }

    public String getMovieNm()
    {
        return movieNm;
    }

    public String getOpenDt()
    {
        return openDt;
    }

    public long getSalesAmt()
    {
        return salesAmt;
    }
}
