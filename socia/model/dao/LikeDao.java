package ir.saman.socia.model.dao;

import ir.saman.socia.model.Like;

public class LikeDao extends Dao<Like> {

    @Override
    String getFileName() {
        return "likes.data";
    }
}
