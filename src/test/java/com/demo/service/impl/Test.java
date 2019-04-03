package com.demo.service.impl;

import com.demo.domain.User;
import sun.misc.GC;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: fanyao
 * @Date: 2019/3/22 14:34
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        List<User> users =new ArrayList<User>();
        User user =null;
        for (int i = 0; i <10000000000L; i++) {
            user=new User();
            user.setName("aaa"+i);
            users.add(user);
            if (users.size() ==500000){
               //users=null;
                users.clear();
             //   System.gc();
                //users =new ArrayList<User>();

               //
            }
        }
        System.out.println(users.size());
    }
}
