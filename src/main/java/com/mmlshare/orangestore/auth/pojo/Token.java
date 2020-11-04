package com.mmlshare.orangestore.auth.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;

@TypeAlias("token")
public class Token {
    @Id
    private String username;
    @Indexed
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
