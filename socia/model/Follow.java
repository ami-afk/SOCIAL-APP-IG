package ir.saman.socia.model;

import java.io.Serializable;
import java.util.Date;

public class Follow implements Entity {

    private Long id;
    private final User follower;
    private final User following;
    private final FollowState state;
    private final Date whenRequested;

    public Follow(Long id, User follower, User following, FollowState state, Date whenRequested) {
        this.id = id;
        this.follower = follower;
        this.following = following;
        this.state = state;
        this.whenRequested = whenRequested;
    }

    public Follow(User follower, User following, FollowState state, Date whenRequested) {
        this.follower = follower;
        this.following = following;
        this.state = state;
        this.whenRequested = whenRequested;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getFollower() {
        return follower;
    }

    public User getFollowing() {
        return following;
    }

    public FollowState getState() {
        return state;
    }

    public Date getWhenRequested() {
        return whenRequested;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "id=" + id +
                ", follower=" + follower +
                ", following=" + following +
                ", state=" + state +
                ", whenRequested=" + whenRequested +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Follow follow = (Follow) o;

        if (!getFollower().equals(follow.getFollower())) return false;
        return getFollowing().equals(follow.getFollowing());
    }

    @Override
    public int hashCode() {
        int result = getFollower().hashCode();
        result = 31 * result + getFollowing().hashCode();
        return result;
    }
}
