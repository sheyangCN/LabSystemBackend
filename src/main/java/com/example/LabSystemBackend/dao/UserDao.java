package com.example.LabSystemBackend.dao;

import com.example.LabSystemBackend.entity.User;
import com.example.LabSystemBackend.entity.UserAccountStatus;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> getAllUser();

    List<User> getAllAdministrators();

    User getUser(@Param("userId") int userId);

    int deleteUser(@Param("userId") int userId);

    int insertUser(@Param("user") User user);

    int updateUser(@Param("user") User user);

    int updatePassword(@Param("userId") int userId, @Param("password") String password);

    int updateUserAccountStatus(@Param("userAccountStatus")UserAccountStatus userAccountStatus,@Param("userId") int userId);

    int updateRealName(@Param("userId")int userId, @Param("realName") String realName);


}
