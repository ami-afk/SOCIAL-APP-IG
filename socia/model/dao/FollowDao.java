package ir.saman.socia.model.dao;

import ir.saman.socia.model.Follow;

public class FollowDao extends Dao<Follow> {

    @Override
    String getFileName() {
        return "follows.data";
    }
}
