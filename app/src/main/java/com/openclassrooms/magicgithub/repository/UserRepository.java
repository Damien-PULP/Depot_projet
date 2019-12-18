package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier

        //------------modif---------//
        List<User> users = apiService.getUsers();
        return users;
        //return null;
        //-------------------------//

    }

    public void generateRandomUser() {

        //----------modif---------//

        apiService.generateRandomUser();
        //-----------------------//
        // TODO: A modifier
    }

    public void deleteUser(User user) {
        // TODO: A modifier
        //------------modif------------//
        apiService.deleteUser(user);
        //-----------------------------//
    }
}
