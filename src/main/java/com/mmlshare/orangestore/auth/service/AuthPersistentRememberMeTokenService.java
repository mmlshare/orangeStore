package com.mmlshare.orangestore.auth.service;

import com.mmlshare.orangestore.auth.pojo.Token;
import com.mmlshare.orangestore.auth.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service("authPersistentRememberMeTokenService")
public class AuthPersistentRememberMeTokenService implements PersistentTokenRepository {
    @Autowired
    private TokenRepository tokenRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void createNewToken(PersistentRememberMeToken token) {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss.SSS");
        Token sysToken = new Token();
        sysToken.setUsername(token.getUsername());
        Date date = new Date();
        sysToken.setLastUsed(date.getTime());
        sysToken.setLastUsedStr(dateFormat.format(date));
        sysToken.setSeries(token.getSeries());
        sysToken.setTokenValue(token.getTokenValue());
        tokenRepository.save(sysToken);
    }

    @Override
    public void updateToken(String series, String tokenValue, Date lastUsed) {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss.SSS");
        Criteria criteria = new Criteria();
        criteria.where("series").is(series);
        Query query = new Query(criteria);
        Update update = new Update()
                .set("tokenValue", tokenValue)
                .set("lastUsed", lastUsed.getTime())
                .set("lastUsedStr", dateFormat.format(lastUsed));
        mongoTemplate.updateFirst(query, update, Token.class);
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String seriesId) {
        Token sysToken = tokenRepository.findBySeries(seriesId);
        if (sysToken == null) {
            return null;
        }
        PersistentRememberMeToken token = new PersistentRememberMeToken(sysToken.getUsername(), sysToken.getSeries(), sysToken.getTokenValue(), new Date(sysToken.getLastUsed()));
        return token;
    }

    @Override
    public void removeUserTokens(String username) {
        tokenRepository.deleteById(username);

    }
}
