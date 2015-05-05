package edu.ncsu.mobile.traces;

/**
 * Created by Tyrone on 4/9/2015.
 */
public class FeedItem {
    private String userName;
    private String thumbnail;
    private String tweet;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTweet() {return tweet; }

    public void setTweet(String tweet) {this.tweet = tweet; }
}
