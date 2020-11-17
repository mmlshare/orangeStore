package com.mmlshare.orangestore.auth.repository;


import com.mmlshare.auth.beans.Token;

public interface TokenRepository {

    Token findBySeries(String series);

    void addToken(Token token);

    void removeTokenByUsername(String userName);

    void modifyBySeries(Token token);
}
