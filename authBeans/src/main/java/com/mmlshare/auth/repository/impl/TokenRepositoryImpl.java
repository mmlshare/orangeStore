package com.mmlshare.auth.repository.impl;

import com.mmlshare.auth.beans.Token;
import com.mmlshare.auth.mapper.RoleMapper;
import com.mmlshare.auth.mapper.TokenMapper;
import com.mmlshare.auth.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TokenRepositoryImpl implements TokenRepository {

    @Autowired
    private TokenMapper tokenMapper;

    @Override
    public void addToken(Token token) {
        tokenMapper.insertToken(token);
    }

    @Override
    public void modifyToken(Token token) {
        tokenMapper.updateToken(token);
    }

    @Override
    public Token findTokenBySeries(String series) {
        return tokenMapper.selectBySeries(series);
    }

    @Override
    public void removeTokenByUsername(String username) {
        tokenMapper.deleteByUsername( username);
    }
}
