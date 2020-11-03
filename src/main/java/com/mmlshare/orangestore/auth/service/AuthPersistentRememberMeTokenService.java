package com.mmlshare.orangestore.auth.service;

import com.mmlshare.orangestore.auth.pojo.Token;
import com.mmlshare.orangestore.auth.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service("authPersistentRememberMeTokenService")
public class AuthPersistentRememberMeTokenService implements PersistentTokenRepository {
    @Autowired
    private TokenRepository tokenRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void init() {
        System.out.println("");
    }

    @Override
    public void createNewToken(PersistentRememberMeToken token) {
        Token sysToken = new Token();
        sysToken.setUsername(token.getUsername());
        sysToken.setLastUsed(token.getDate());
        sysToken.setSeries(token.getSeries());
        sysToken.setTokenValue(token.getTokenValue());
        tokenRepository.save(sysToken);
    }

    @Override
    public void updateToken(String series, String tokenValue, Date lastUsed) {
        Token sysToken = new Token();
        sysToken.setLastUsed(lastUsed);
        sysToken.setSeries(series);
        sysToken.setTokenValue(tokenValue);
        //tokenRepository.updateToken(sysToken);
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String seriesId) {
        Token sysToken = tokenRepository.findBySeries(seriesId);

        PersistentRememberMeToken token = new PersistentRememberMeToken(sysToken.getUsername(), sysToken.getSeries(), sysToken.getTokenValue(), sysToken.getLastUsed());
        return token;
    }

    @Override
    public void removeUserTokens(String username) {
        tokenRepository.deleteById(username);
    }
}
