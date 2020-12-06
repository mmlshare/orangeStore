package com.mmlshare.auth.mapper;

import com.mmlshare.auth.beans.Token;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TokenMapper {
    void insertToken(Token token);

    void updateToken(Token token);

    Token selectBySeries(String series);

    void deleteByUsername(String username);
}
