package priv.itest.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import priv.itest.backend.dao.UserDao;
import priv.itest.backend.model.User;

import java.util.Date;
import java.util.List;

/**
 * Create By ab.xie.
 * 0n 2018/10/30 15:32.
 */
@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/user")
    public List<User> getUser(){
        List<User> user = userDao.findAllUsers();
        return user;
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String saveUser(@RequestBody User user){
        user.setCreateTime(new Date());
        System.out.println(user);
        int count = userDao.saveUser(user);
        return "" + count;
    }
}
