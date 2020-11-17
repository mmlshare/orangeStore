package com.mmlshare.orangestore.auth.repository;

import com.mmlshare.orangestore.auth.pojo.Token;

public interface TokenRepository {

    Token findBySeries(String series);

    void addToken(Token token);

    void removeTokenByUsername(String userName);

    void modifyBySeries(Token token);
}
