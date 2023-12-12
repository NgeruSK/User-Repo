package com.simsols.user_api.services;

import com.simsols.user_api.dao.UserDAO;
import com.simsols.user_api.models.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<UserModel> allUsers(){
        return userDAO.findAll();
    }

}
