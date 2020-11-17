package com.mmlshare.orangestore.auth.repository.impl;


import com.mmlshare.auth.beans.Token;
import com.mmlshare.orangestore.auth.repository.TokenRepository;
import org.springframework.stereotype.Repository;

@Repository("mongoDbTokenRepository")
public class TokenRepositoryImpl implements TokenRepository {
    @Override
    public Token findBySeries(String series) {
        return null;
    }

    @Override
    public void addToken(Token token) {

    }

    @Override
    public void removeTokenByUsername(String userName) {

    }

    @Override
    public void modifyBySeries(Token token) {

    }
}
