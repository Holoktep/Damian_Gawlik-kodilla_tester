package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static List<User> filterUser(int Age) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > Age)
                .collect(Collectors.toList());

        return users;
    }
    public static List<User> filterNumberOfPost() {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 100)
                .collect(Collectors.toUnmodifiableList());

        return  users;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}