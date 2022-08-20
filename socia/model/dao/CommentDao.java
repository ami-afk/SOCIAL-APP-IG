package ir.saman.socia.model.dao;

import ir.saman.socia.model.Comment;

public class CommentDao extends Dao<Comment> {

    @Override
    String getFileName() {
        return "comments.data";
    }
}
