package com.mmlshare.orangestore.auth.repository.mongodb;

import com.mmlshare.orangestore.auth.pojo.Token;
import com.mmlshare.orangestore.auth.repository.TokenRepository;
import org.springframework.stereotype.Repository;

@Repository("mongoDbTokenRepository")
public class MongoDbTokenRepository implements TokenRepository {
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
