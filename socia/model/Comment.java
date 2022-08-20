package ir.saman.socia.model;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Entity {

    private Long id;
    private final String text;
    private final User commenter;
    private final Post post;
    private final Date createdAt;

    public Comment(Long id, String text, User commenter, Post post, Date createdAt) {
        this.id = id;
        this.text = text;
        this.commenter = commenter;
        this.post = post;
        this.createdAt = createdAt;
    }

    public Comment(String text, User commenter, Post post, Date createdAt) {
        this.text = text;
        this.commenter = commenter;
        this.post = post;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public User getCommenter() {
        return commenter;
    }

    public Post getPost() {
        return post;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", commenter=" + commenter +
                ", post=" + post +
                ", createdAt=" + createdAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (getId() != null ? !getId().equals(comment.getId()) : comment.getId() != null) return false;
        if (!getText().equals(comment.getText())) return false;
        if (!getCommenter().equals(comment.getCommenter())) return false;
        if (!getPost().equals(comment.getPost())) return false;
        return getCreatedAt().equals(comment.getCreatedAt());
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + getText().hashCode();
        result = 31 * result + getCommenter().hashCode();
        result = 31 * result + getPost().hashCode();
        result = 31 * result + getCreatedAt().hashCode();
        return result;
    }
}
