package com.mmlshare.auth.repository;


import com.mmlshare.auth.beans.Token;
import org.springframework.stereotype.Repository;

public interface TokenRepository{

    void addToken(Token token);

    void modifyToken(Token token);

    Token findTokenBySeries(String series);

    void removeTokenByUsername(String username);

}
