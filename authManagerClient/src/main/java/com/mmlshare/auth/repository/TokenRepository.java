package com.mmlshare.auth.repository;


import com.mmlshare.auth.beans.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, String> {


    Token findTokenBySeries(String series);

    void deleteTokenByUsername(String username);

}
