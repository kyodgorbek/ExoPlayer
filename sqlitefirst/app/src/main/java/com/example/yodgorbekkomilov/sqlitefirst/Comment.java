package com.example.yodgorbekkomilov.sqlitefirst;

/**
 * Created by yodgorbekkomilov on 3/18/17.
 */

public class Comment {
private long id;
private String comment;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getComment(){
        return comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }


    @Override
    public String toString(){
        return comment;
    }

}
