package com.simsols.user_api.dao;

import com.simsols.user_api.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserDAO extends JpaRepository<UserModel, UUID> {
}
