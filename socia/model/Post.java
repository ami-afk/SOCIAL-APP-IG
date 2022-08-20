package ir.saman.socia.model;

import java.io.Serializable;
import java.util.Date;

public class Post implements Entity {

    private Long id;
    private final Date createdAt;
    private final String mediaUrl;
    private final User owner;

    public Post(Long id, Date createdAt, String mediaUrl, User owner) {
        this.id = id;
        this.createdAt = createdAt;
        this.mediaUrl = mediaUrl;
        this.owner = owner;
    }

    public Post(Date createdAt, String mediaUrl, User owner) {
        this.createdAt = createdAt;
        this.mediaUrl = mediaUrl;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", mediaUrl='" + mediaUrl + '\'' +
                ", owner=" + owner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (getId() != null ? !getId().equals(post.getId()) : post.getId() != null) return false;
        if (!getCreatedAt().equals(post.getCreatedAt())) return false;
        if (!getMediaUrl().equals(post.getMediaUrl())) return false;
        return getOwner().equals(post.getOwner());
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + getCreatedAt().hashCode();
        result = 31 * result + getMediaUrl().hashCode();
        result = 31 * result + getOwner().hashCode();
        return result;
    }
}
