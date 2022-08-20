package ir.saman.socia.service;

import ir.saman.socia.exception.error.LoginFailedException;
import ir.saman.socia.model.User;
import ir.saman.socia.model.dao.FollowDao;
import ir.saman.socia.model.dao.UserDao;

public class UserManager {

    private UserDao userDao;
    private FollowDao followDao;
    private IdGenerator<User> userIdGenerator;

    public UserManager(UserDao userDao, FollowDao followDao, IdGenerator<User> userIdGenerator) {
        this.userDao = userDao;
        this.followDao = followDao;
        this.userIdGenerator = userIdGenerator;
    }

    public User login(String username, String password) {

        return userDao.getAll()
                .stream()
                .filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password))
                .findFirst()
                .orElseThrow(() -> new LoginFailedException());
    }

    public User register(String username, String password) {
        User user = new User(username, password, "http://socia.saman.ir/avatars/def.jpg");
        user.setId(userIdGenerator.getNextId());

        userDao.save(user);
        return user;
    }
}
