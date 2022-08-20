package ir.saman.socia.model;

import java.io.Serializable;
import java.util.Date;

public class Like implements Entity {

    private Long id;
    private final User liker;
    private final Post post;
    private final Date createdAt;

    public Like(Long id, User liker, Post post, Date createdAt) {
        this.id = id;
        this.liker = liker;
        this.post = post;
        this.createdAt = createdAt;
    }

    public Like(User liker, Post post, Date createdAt) {
        this.liker = liker;
        this.post = post;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getLiker() {
        return liker;
    }

    public Post getPost() {
        return post;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", liker=" + liker +
                ", post=" + post +
                ", createdAt=" + createdAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Like like = (Like) o;

        if (!getLiker().equals(like.getLiker())) return false;
        return getPost().equals(like.getPost());
    }

    @Override
    public int hashCode() {
        int result = getLiker().hashCode();
        result = 31 * result + getPost().hashCode();
        return result;
    }
}
