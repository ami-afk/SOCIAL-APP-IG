package ir.saman.socia.service;

import ir.saman.socia.model.Post;
import ir.saman.socia.model.dao.CommentDao;
import ir.saman.socia.model.dao.FollowDao;
import ir.saman.socia.model.dao.LikeDao;
import ir.saman.socia.model.dao.PostDao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class PostManager {

    private PostDao postDao;
    private CommentDao commentDao;
    private LikeDao likeDao;
    private FollowDao followDao;

    public PostManager(PostDao postDao, CommentDao commentDao, LikeDao likeDao, FollowDao followDao) {
        this.postDao = postDao;
        this.commentDao = commentDao;
        this.likeDao = likeDao;
        this.followDao = followDao;
    }

    public Collection<Post> getUserFeed(long userId) {
        Set<Long> userFollowingsUserId = followDao.getAll()
                .stream()
                .filter(follow -> follow.getFollower().getId() == userId)
                .map(follow -> follow.getFollowing().getId())
                .collect(Collectors.toSet());

        return postDao.getAll()
                .stream()
                .filter(post -> userFollowingsUserId.contains(post.getOwner().getId()))
                .sorted((post1, post2) -> post2.getCreatedAt().compareTo(post1.getCreatedAt()))
                .collect(Collectors.toList());
    }


}
