package ir.saman.socia.model.dao;

import ir.saman.socia.model.User;

public class UserDao extends Dao<User> {
    String getFileName() {
        return "users.data";
    }
}
