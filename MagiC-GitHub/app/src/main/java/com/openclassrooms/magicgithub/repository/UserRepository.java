package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
//        Retourne les utilisateurs à la base de données
        return apiService.getUsers();
    }

    public void generateRandomUser() {
//        Ajoute un utilisateur au harsard à la base de données
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
//        Supprime un utilisateur de la base de données
        apiService.deleteUser(user);
    }
}
