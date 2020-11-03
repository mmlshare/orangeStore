package com.mmlshare.orangestore.auth.repository;

import com.mmlshare.orangestore.auth.pojo.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDetailRepository extends PagingAndSortingRepository<User, String> {

}
