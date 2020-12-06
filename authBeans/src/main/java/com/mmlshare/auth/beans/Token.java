package com.mmlshare.auth.beans;



/**
 * Token
 */

public class Token {

    private String username;
    private String series;

    private String tokenValue;
    private long lastUsed;

    private String lastUsedStr;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public long getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(long lastUsed) {
        this.lastUsed = lastUsed;
    }

    public String getLastUsedStr() {
        return lastUsedStr;
    }

    public void setLastUsedStr(String lastUsedStr) {
        this.lastUsedStr = lastUsedStr;
    }
}
