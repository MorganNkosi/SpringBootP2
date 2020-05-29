package com.Morgan.service;

import com.Morgan.users.Users;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Cacheable("Users")
    public Users getUser(long id){
        try
        {
            System.out.println("Going to sleep for 4 Secs.. to simulate backend call.");
            Thread.sleep(1000*4);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return new Users(1,"Morgan" ,"Zwane");
    }
}
