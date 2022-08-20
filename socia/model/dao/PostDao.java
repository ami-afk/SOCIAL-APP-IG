package ir.saman.socia.model.dao;

import ir.saman.socia.model.Post;

public class PostDao extends Dao<Post> {

    @Override
    String getFileName() {
        return "posts.data";
    }

}
