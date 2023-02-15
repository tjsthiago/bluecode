package com.bluecode.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "shortener_request", catalog="public")
public class ShortenerRequest {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="url", length = 2048)
    private String url;

    @Column(name="shortened_url", length = 2048)
    private String shortenedUrl;

    @Column(name="shortened_count")
    private Long shortenedCount;

    public ShortenerRequest() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortenedUrl() {
        return shortenedUrl;
    }

    public void setShortenedUrl(String shortenedUrl) {
        this.shortenedUrl = shortenedUrl;
    }

    public Long getShortenedCount() {
        return shortenedCount;
    }

    public void setShortenedCount(Long shortenedCount) {
        this.shortenedCount = shortenedCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortenerRequest that = (ShortenerRequest) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
