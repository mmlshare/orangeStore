package com.mmlshare.auth.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Token
 */

@Entity
@Table(name = "token")
public class Token {

    @Column(length = 30, name = "username")
    private String username;
    @Id
    @Column(length = 60, name = "series")
    private String series;

    @Column(length = 60, name = "token_value")
    private String tokenValue;
    @Column(name = "last_used")
    private long lastUsed;

    @Column(length = 30, name = "last_used_str")
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
