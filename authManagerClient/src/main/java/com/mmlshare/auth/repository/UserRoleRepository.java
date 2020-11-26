package com.mmlshare.auth.repository;

import com.mmlshare.auth.beans.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String> {

    List<UserRole> findUserRolesByUsername(String username);
}
