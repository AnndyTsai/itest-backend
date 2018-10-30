package priv.itest.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.itest.backend.model.User;

/**
 * Create By ab.xie.
 * 0n 2018/10/30 15:32.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user")
    public User getUser(){
        User user = new User();
        user.setUserName("fuck");
        return user.convertTo(User.class);
    }
}
