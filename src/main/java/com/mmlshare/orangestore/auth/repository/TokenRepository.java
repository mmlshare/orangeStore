package com.mmlshare.orangestore.auth.repository;

import com.mmlshare.orangestore.auth.pojo.Token;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TokenRepository extends PagingAndSortingRepository<Token, String> {

    @Query("{'series':?0}")
    Token findBySeries(String series);
}
