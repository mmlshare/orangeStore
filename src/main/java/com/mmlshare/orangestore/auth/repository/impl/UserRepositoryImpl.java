package com.mmlshare.orangestore.auth.repository.mongodb;

import com.mmlshare.orangestore.auth.pojo.User;
import com.mmlshare.orangestore.auth.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository("mongoDbUserRepository")
public class MongoDbUserRepository implements UserRepository {
    @Override
    public void addUser(User user) {

    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }

    @Override
    public void modifyUser(User user) {

    }

    @Override
    public void deleteByUsername(String username) {

    }
}
