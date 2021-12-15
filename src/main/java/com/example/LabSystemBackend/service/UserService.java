package com.example.LabSystemBackend.service;

import com.example.LabSystemBackend.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUser(int userId);

    int deleteUser(int userId);

    int insertUser(User user);

    //login
    User login(String email, String password, boolean isAdmin);

    //log out
    User logout(String email);

    //register one account
    int register(String email, String password, String firstName, String lastName, String vertificationCode);

    //reset password
    int resetPassword(String email, String newPassword, String vertificationCode);

    //confirm the application of user to create a new account
    User confirmUserRegistration(int userId);

    //reject the application of user to create a new account
    boolean rejectUserRegistration(int userId);//拒绝用户申请后，直接在数据库里清除用户的信息

    //change username
    int changeUserName(int userId, String newFirstName, String newLastName);

    //activate or deactivate account
    int deactivateUser(int userId);

    int activateUser(int userId);

    //get a list of all users
    List<User> getAllUsers();

    //get a list of all admins
    List<User> getAllAdministrator();
}
