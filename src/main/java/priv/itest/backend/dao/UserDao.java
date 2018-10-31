package priv.itest.backend.dao;

import priv.itest.backend.model.User;

import java.util.List;

/**
 * Create By ab.xie.
 * 0n 2018/10/31 15:03.
 */
public interface UserDao {
    User findByUserId(Integer userId);

    List<User> findAllUsers();

    int saveUser(User user);
}
