package com.cg.oms.repository;

import java.util.ArrayList;

import com.cg.oms.entity.Login;
import com.cg.oms.entity.User;

public interface IUserRepository
{
    public User addUserDetails(User user);
    public Login addLoginDetails(Login login);
    public ArrayList<User> getAllUserDetails();
   // public ArrayList<Login> getAllLoginDetails();
    public User getUserDetailsById(String userId);
    public Login getLoginDetailsById(String userId);
    public Login deleteUserDetailsById(String userId);
    public Login deleteLoginDetailsById(String userId);
    public Login changePassword(Login login );
    public Login resetPassword(Login login );
    public User updateUserDetails(User user);
    //add more function if require as per requirnment

    
}
